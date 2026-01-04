# 🛡️ SafePic - Backend API Server

![SafePic Logo](https://via.placeholder.com/150x150.png?text=SafePic+Logo) > **SafePic 조직의 백엔드 시스템으로, 중고 거래 로직과 AI 이미지 검증 엔진을 통합 관리합니다.**
> 본 프로젝트는 대규모 트래픽 확장을 고려한 컨테이너 기반 인프라와 실시간 통신 시스템 구축에 초점을 맞추었습니다.

---

## 🚀 Key Technical Challenges

### 1. AI-Driven Image Verification Pipeline
- **비동기 분석 처리:** 외부 AI API와의 통신 시 발생하는 레이턴시가 사용자 경험(UX)을 해치지 않도록 비동기 이벤트 방식으로 설계하였습니다.
- **판별 신뢰도 관리:** `IMAGE_VERIFICATIONS` 테이블을 분리 설계하여 AI 분석 원문 데이터와 관리자 수동 보정 데이터를 체계적으로 관리합니다.

### 2. Scalable Infrastructure (AWS & Docker)
- **Container Orchestration:** AWS ECS(EC2 Mode)를 활용하여 서비스 확장이 용이한 구조를 설계하고 프리티어 환경 내에서 운영 효율을 극대화했습니다.
- **CI/CD Pipeline:** GitHub Actions를 활용하여 코드 푸시부터 ECR 이미지 빌드, ECS 배포까지 이르는 무중단 배포 환경을 구축했습니다.

### 3. Real-time Interaction
- **WebSocket (STOMP):** 판매자와 구매자 간의 실시간 채팅 시스템을 구축하고, 실물 인증 요청과 같은 특수 인터렉션을 커스텀 메시지 타입으로 처리합니다.

---

## 🛠 Tech Stack

### Core
- **Language/Framework:** Java 17 / Spring Boot 3.x
- **Build Tool:** Gradle
- **Security:** Spring Security (RBAC), JWT, OAuth 2.0

### Persistence & Storage
- **Main Database:** PostgreSQL (Relation & JSONB)
- **Cache/Session:** Redis
- **File Storage:** AWS S3

### Infrastructure & DevOps
- **Deployment:** AWS ECS (EC2 Type), AWS ECR
- **CI/CD:** GitHub Actions
- **Container:** Docker, Docker Compose

---

## 📐 Architecture Diagram

```mermaid
graph LR
    subgraph "Client Side"
        RN[React Native App]
    end

    subgraph "AWS Cloud (Free Tier)"
        ALB[Application Load Balancer]
        ECS[AWS ECS Cluster]
        RDS[(PostgreSQL)]
        S3[AWS S3]
    end

    subgraph "External API"
        AI[AI Image Detection Engine]
    end

    RN --> ALB
    ALB --> ECS
    ECS --> RDS
    ECS --> S3
    ECS --> AI
