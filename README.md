# 🌿 Checkerly Backend: The Source of Trust

> **"건강한 생태계는 튼튼한 뿌리(Root)로부터 시작됩니다."**

**Checkerly-Backend**는 AI 기반 안심 중고거래 플랫폼 '체커리'의 핵심 엔진입니다. 우리는 사기의 싹을 잘라내고, 사용자(Seed)가 안심하고 거래할 수 있는 투명한 환경을 구축하기 위해 팀 **Root**가 개발하는 시스템입니다.

---

## 🛠 Tech Stack (Root's Foundation)

팀 **Root**는 안정성과 확장성을 위해 다음 기술 스택을 기반으로 시스템을 구축합니다.

* **Framework:** Spring Boot 3.x
* **Language:** Java 17
* **Database:** PostgreSQL (Relation & Log Management)
* **Authentication:** JWT (JSON Web Token) based Security
* **Real-time:** WebSocket (Stomp) for Real-time Chatting
* **Security:** RBAC (Role Based Access Control)

---

## 🏗 Key Features (Backend Logic)

### 1. AI Detox & Verification (AI 검증)
* **거래 AI 분석:** 거래 생성 및 진행 시 사기 패턴 AI 분석 수행.
* **내부 점수 산정:** Trust/Risk/Activity 점수를 계산하되 사용자에게는 비노출 처리.
* **승인 파이프라인:** AI 판단 결과에 대한 관리자의 승인/반려 및 태그 기준 관리.

### 2. Seed & Root Management (인증 및 관리)
* **역할 기반 분기:** 로그인 성공 시 role(USER/ADMIN)에 따른 엔트리 포인트 분리.
* **계정 제어:** 관리자에 의한 신고 내역 조회 및 사기 적발 시 사용자 계정 정지/해제.
* **통합 구조:** 사용자/관리자 기능을 하나의 앱 구조에서 통합 제공.

### 3. Transaction & Chatting (중고거래 및 채팅)
* **실시간 소통:** 1:1 채팅, 메시지 송수신 및 채팅 로그 서버 저장.
* **상품 및 거래 관리:** 상품 등록/수정 및 거래 단계별(대기/진행/완료/취소) 이벤트 로그 저장.
* **보안 접근 제어:** API 및 화면 접근 권한 분리 및 JWT 기반 인증.

---

## 📊 Database Schema (ERD Preview)

우리는 **Seed(사용자)**의 성장과 **Root(관리자)**의 정화 작용을 중심으로 설계되었습니다.

* **Users:** Seed들의 신뢰 점수 및 계정 상태 관리.
* **AI_Logs:** 사기 패턴 분석 근거 및 관리자 판단 로그 기록.
* **Tags:** AI 점수 기반의 체커리 상태/성향/신뢰 태그 부여.

---

## 🚀 Getting Started

```bash
# Repository Clone
git clone [https://github.com/Root/Checkerly-Backend.git](https://github.com/Root/Checkerly-Backend.git)

# Build & Run
./gradlew bootRun
```

---

## 👥 Team Root

우리는 생태계의 근간을 설계하고, 기술로써 신뢰의 가치를 증명합니다.

* **Backend Lead**: 시스템 아키텍처 및 AI 파이프라인 설계
* **Infrastructure**: CI/CD 구축 및 데이터베이스 최적화
* **Security**: JWT 기반 인증 및 RBAC 권한 제어

---

Copyright © 2026 Team Root. All rights reserved.