package services.call_service;

public class Call {
    private Contact caller;
    private Contact receiver;
    private CallStatus status; // enum para estados da chamada

    public Call(Contact caller, Contact receiver) {
        this.caller = caller;
        this.receiver = receiver;
        this.status = CallStatus.INITIATED;
    }

    // Iniciar chamada só se ainda não estiver tocando, em andamento ou finalizada
    public void startCall() {
        if (status != CallStatus.INITIATED) {
            System.out.println("Não é possível iniciar a chamada. Estado atual: " + status);
            return;
        }

        if (caller.isOnCall()) {
            System.out.println("O contato " + caller.getName() + " já está em outra ligação.");
            return;
        }
        if (receiver.isOnCall()) {
            System.out.println("O contato " + receiver.getName() + " está ocupado.");
            sendToVoicemail();
            status = CallStatus.ENDED; // Finaliza porque não pode continuar
            return;
        }

        System.out.println(caller.getName() + " está chamando " + receiver.getName());
        caller.setOnCall(true);
        receiver.setOnCall(true);
        status = CallStatus.RINGING;
    }

    // Atender chamada só se estiver tocando
    public void answerCall() {
        if (status != CallStatus.RINGING) {
            System.out.println("Chamada não está tocando para ser atendida. Estado atual: " + status);
            return;
        }
        status = CallStatus.IN_PROGRESS;
        System.out.println(receiver.getName() + " atendeu a chamada.");
    }

    // Rejeitar chamada só se estiver tocando
    public void rejectCall() {
        if (status != CallStatus.RINGING) {
            System.out.println("Chamada não está tocando para ser rejeitada. Estado atual: " + status);
            return;
        }
        System.out.println(receiver.getName() + " rejeitou a chamada.");
        sendToVoicemail();
        endCall(); // Aqui endCall já vai verificar estado
    }

    // Cancelar chamada só se não estiver em andamento ou finalizada
    public void cancelCall() {
        if (status == CallStatus.IN_PROGRESS) {
            System.out.println("Chamada já em andamento e não pode ser cancelada.");
            return;
        }
        if (status == CallStatus.ENDED) {
            System.out.println("Chamada já finalizada, não pode cancelar.");
            return;
        }
        System.out.println(caller.getName() + " cancelou a chamada.");
        endCall();
    }

    // Encerrar chamada só se não estiver já finalizada
    public void endCall() {
        if (status == CallStatus.ENDED) {
            System.out.println("Chamada já está finalizada.");
            return;
        }
        System.out.println("Ligação finalizada.");
        status = CallStatus.ENDED;
        caller.setOnCall(false);
        receiver.setOnCall(false);
    }

    // Caixa postal
    private void sendToVoicemail() {
        System.out.println("Caixa postal ativada para " + receiver.getName());
    }

    // Getters para status e contatos (útil para debug/testes)
    public CallStatus getStatus() {
        return status;
    }
}
