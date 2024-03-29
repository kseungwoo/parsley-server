# 자연어 처리 기술을 활용한 뉴스 구독 



## 작품 소개

본 연구 작품에서는 자연어처리, 특히 키워드 추출과 텍스트 요약과 관련된 기술을 응용하여 위해 크롤링한 실시간 뉴스를 분석하고, 이를 활용하여 높은 사용자 경험 의 뉴스 구독 어플리케이션을 제안한다. 본 연구를 통해 향후 정치, 경제, 사회, 예술 등 다양한 분야에 자연어 처리를 응용한 어플리케이션 개발 및 연구에 의미있는 정보 제공을 그 목적으로 한다. 



## 프로젝트 구조

<img width="600" alt="image" src="https://user-images.githubusercontent.com/71204049/155873794-a55f748e-d061-43a5-88f1-f43121fa26ff.png">

## 앱 디자인

![image](https://user-images.githubusercontent.com/71204049/198196956-5e36db87-54a8-4930-beb6-af8318046b36.png)

## 데이터 크롤링
JSoup 라이브러리리와 @Scheduled 크론식을 활용한다.

## 키워드 추출
키워드 추출에는 TF-IDF 기법이 사용된다. 먼저, 문장 리스트와 키워드를 인자로 입력받으면 TF를 계산하는 메서드와, 태그 리스트와 키워드를 입력받으면 IDF를 계산하는 메서드를 정의한다. TF를 구할 때 문장 리스트는 TF에서의 문서에 해당하며, IDF를 계산할 때 태그 리스트 또한 문서라고 볼 수 있다. 이렇게 정의된 메서드를 기반으로 TF-IDF를 구할 수 있고, 이 수치를 내림차순하여 상위에 태그된 키워드들을 추출할 수 있다. 이러한 자연어 처리 로직을 자바 언어로 구현한 라이브러리를 사용하였고, 이를 기반으로 실제 기사로부터 키워드를 추출하였다.
## 커밋 컨벤션
- feat: 새로운 기능 추가
- fix: 버그 수정
- docs: 문서 수정
- style: 코드 포맷 변경, 코드 수정이 없는 경우
- refactor: 코드 리팩토링
- test: 테스트 코드 작성, 테스트 코드 리팩토링(프로덕션 코드 변경X)
- dev: 라이브러리 설치 등 개발 환경 세팅
- comment: 필요한 주석 추가 및 변경
- remove: 파일을 삭제하는 작업만 수행한 경우
- rename: 파일 혹은 폴더명을 수정하거나 옮기는 작업만 한 경우
- chore: 이외 기타 사항



## 브랜치 전략

> git-flow

<img width="452" alt="image" src="https://user-images.githubusercontent.com/71204049/155872620-c4e2a60f-14c5-4476-b9fe-08eaf61fd86b.png">



## 링크

- [Google Drive](https://drive.google.com/drive/folders/1CVLreq55DzznVD5GJ2RD3aXPW071FyFS?usp=sharing)
