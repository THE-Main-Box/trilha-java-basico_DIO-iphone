# 🎧 Simulação de iPhone - Sistema de Mídia

Este projeto é uma simulação modular de um iPhone, com foco na arquitetura dos sistemas internos. Abaixo, a documentação da arquitetura do **Player de Mídia**.

---

## 🎵 Módulo: Player de Mídia (Base)

Este módulo contém a arquitetura para reprodução de mídias de forma genérica (áudio e vídeo).

## 🎵 Diagrama de Classes - Sistema de Mídia

![Diagrama de Classes](./diagrams/Editor%20_%20Mermaid%20Chart-2025-06-16-170025.png)

---

## 📞 Módulo: Sistema de Chamadas

Este módulo simula o sistema de chamadas de um iPhone, respeitando os estados da ligação (iniciada, tocando, em andamento e encerrada).

### 📞 Diagrama de Classes - Sistema de Chamadas
![Diagrama de Classes](diagrams/Editor%20_%20Mermaid%20Chart-2025-06-16-173704.png)

---

## 🌐 Módulo: Navegador Web Simulado

Este módulo simula um navegador básico dentro do iPhone. Ele possui suporte para:

- Abrir URLs
- Pesquisar termos (convertendo em uma URL simulada)
- Adicionar novas abas
- Recarregar a página atual
- Delegar carregamento e renderização para objetos do tipo `Page`

A arquitetura é baseada em uma interface `WebBrowser` e uma implementação concreta `SimpleBrowser`, promovendo flexibilidade e desacoplamento.

### 🌐 Diagrama de Classes - Sistema de Navegação Web

![Diagrama de Classes](./diagrams/Editor%20_%20Mermaid%20Chart-2025-06-16-175750.png)

---
