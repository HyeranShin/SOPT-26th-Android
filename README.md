# 📌 SOPT 26th Android Seminar 🤳🏻📱
세미나 내용과 과제, 스스로 알아본 내용을 정리하는 저장소 👩🏻‍💻 　　　　　　　　 　　　　　`👇🏻click emoji👇🏻`
||내용|날짜|자료|정리|과제|
|---|---|:---:|:---:|:---:|---|
|**1차 보충 세미나**|Kotlin 기초|20.04.18|[📊](https://github.com/HyeranShin/SOPT-26th-Android/blob/master/1stSeminar/1차%20보충%20세미나.pdf)|[✏️](#1차-보충-세미나-정리)|-|20.04.18|
|**1차 세미나**|각종 레이아웃의 활용, 로그인과 회원가입 화면 완성|20.04.18|[📊](https://github.com/HyeranShin/SOPT-26th-Android/blob/master/1stSeminar/1차%20세미나%20-%20각종%20레이아웃의%20활용.pdf)|[](#1차-세미나-정리)|[🏠](#1차-세미나-과제)|
|**2차 세미나**|Bottom Navigation, ViewPager, RecyclerView|20.04.25|[📊](https://github.com/HyeranShin/SOPT-26th-Android/blob/master/2ndSeminar/2차%20세미나%20-%20Bottom%20Navigation%2C%20ViewPager%2C%20RecyclerView.pdf)|[](#2차-세미나-정리)|[🏠](#2차-세미나-과제)|
|**3차 세미나**|Open API를 이용한 Retrofit2||[]()|[](#3차-세미나-정리)|[](#3차-세미나-과제)||
|**4차 세미나**|자주 쓰이는 기능들에 대하여||[]()|[](#4차-세미나-정리)|[](#4차-세미나-과제)||
|**5차 세미나**|디자인 합동 세미나||[]()|[](#5차-세미나-정리)|[](#5차-세미나-과제)||
|**6차 세미나**|ViewPager, Fragment, TabLayout 등의 연동||[]()|[](#6차-세미나-정리)|[](#6차-세미나-과제)||
|**7차 세미나**|서버 합동 세미나||[]()|[](#7차-세미나-정리)|[](#7차-세미나-과제)||
|**8차 세미나**|Firebase 연동||[]()|[](#8차-세미나-정리)|[](#8차-세미나-과제)||

자료 제작 & 진행: [@CHJUNE-android](https://github.com/CHJUNE-android)

<br/>

## 1차 보충 세미나 정리
### 1. 변수 선언
#### 선언하기
- `val` - 읽기 전용 변수
- `var` - 변경 가능 변수
#### 타입 지정하기
- `: 타입` 을 이용해서 타입 지정 가능 
- 코틀린에서 타입 지정은 모두 대문자
- Kotlin은 자동으로 타입 추론 
```kotlin
val num1: Int = 2 //val로 정의한 변수는 변경 불가
var num2: Int = 3 //var로 정의한 변수는 변경 가능
val name = "혜란" //자동으로 타입 추론 : String 생략
```
#### lateinit 프로퍼티 초기화 미루기
- `lateinit`은 `var`로 선언한 프로퍼티에만 사용 가능
- `lateinit`은 클래스 몸체, Top-Level, 함수 내부에 선언한 프로퍼티에 사용 가능. 주 생성자에서는 사용 불가
- `null` 허용 프로퍼티에는 사용 불가 
- 기초 타입 프로퍼티에는 사용 불가
```kotlin
lateinit var data1: String //성공

class User2(lateinit var data: String) { //에러
  lateinit val data2: String //에러
  lateinit val data3: String? //에러
  lateinit val data4: Int //에러
```
### 2. 함수 선언
- `fun` - 함수 선언
- `max` - 함수 이름
- `(a: Int, b: Int)` - 파라미터 목록
- `: Int` - 함수 반환 타입
```kotlin
fun max(a: Int, b: Int): Int {
  val num1: Int = 2
  var num2: Int = 3
  
  Log.d("num", "num1=${num1}")
  Log.d("plus", "num1 + num2 = ${num1+num2}")
  return if(a>b) a else b
}
```
### 3. 문자열 템플릿
- 문자열 템플릿: 문자열 출력 시 `${}`을 이용하여 변수 / 식을 함께 출력 가능
- 로그: `Log.d("태그 이름", "로그 내용")`
```kotlin
fun exerciseLog() {
  val num1: Int = 2
  var num2: Int = 3
  
  Log.d("num", "num1=${num1}")
  Log.d("plus", "num1 + num2 = ${num1+num2}")
}
```
### ✔️ 중간 점검
a, b에 해당하는 `Int` 값을 받아 두 수의 곱을 로그로 출력하고, 두 수의 합을 반환하는 함수 만들기
```kotlin
fun sum(a: Int, b: Int): Int {
  Log.d("multiply", "a 곱하기 b의 값은 ${a*b}입니다.")
  return a+b
}
```
### 4. 반복문 for
- `for(i in 0..10)`
- `for(i in 0 until 10)`
```kotlin
for(i in 0..10) { //i가 0부터 10까지 반복(10 포함)
  Log.d("for", "..을 이용하면 i:${i}")
}
for(i in 0 until 10) { //i가 0부터 9까지 반복
  Log.d("for", "until을 이용하면 i:${i}")
}
```
### 5. 스마트 캐스트 is
- 코틀린 스마트 캐스트 `is`를 이용해 타입 검사를 한 경우 변환된 타입이 적용
```kotlin
private fun printSum(voca: Any) {
  if(voca is Int) {
    val a = 15
    //val b = voca as Int
    val b = voca
    Log.d("test", "a +. b는 ${a+b} 입니다")
  }
}
```
### 6. if와 when의 사용
- 자바의 `switch`문 대체
```kotlin
private fun printSum(voca: String) {
  when(voca) {
    "A","B","C" -> {Log.d("test", "${voca} 입니다")}
    else -> {Log.d("test", "A도 B도 C도 아니네")}
  }
}
```
### 7. 코틀린 null 처리
#### `NullPointerException`
- Null 때문에 발생하는 Runtime Error
- 문제점
  - Null 자체의 의미가 모호해서 자주 발생
  - 에러 발생 이후 디버깅이 매우 어려움
1) Null 가능 `?`
```kotlin
override fun afterTextChanged(s: Editable?) {} 
//s에 Null이 들어갈 수 있음
```
2) Null safe operator `?.`
```kotlin
s?.toUpperCase()
//S가 null이면 null 리턴
//Null이 아니라면 toUpperCase() 함수 실행
```
3) Elvis 연산자 `?:`
```kotlin
val name = hi ?: "안녕" //좌항이 null인 경우 default 값으로 우항을 설정
```
4) Safe case `as?`
```kotlin
val objA = someObj as? Something ?: DefaultObj
//someObj를 Something으로 캐스팅 시도
//불가능하다면 → DefaultObj를 objA로 초기화
//가능하다면 → Something을 objA로 초기화
```
5) 강제 not null 처리 `!!`
```kotlin
var num1: String? = null
private fun mixNum() {
  num1 = "one"
  val completeNumber: String = num1!!
  //Num1이 nullable 타입이므로 val completeNumber: String = num1로 한다면 빨간줄이 그이게 됨
  //프로그래머가 num1이 null이 아님을 알고 있으므로 !!를 통해 강제 not null 처리
}
```
6) let 함수 `let{}`
```kotlin
email?.let{sendEmailTo()} //Email이 null이 아닐때만 let{} 내부 로직 수행
```
7) property 초기화 지연 `lateinit var`
```kotlin
lateinit var name: String //변수 name을 나중에 초기화하겠다
```

<br/>

## 1차 세미나 정리

<br/>

## 1차 세미나 과제

### 기본 1️⃣ ConstraintLayout 심화 학습 
<img width="290dp" height=auto alt="1차 세미나 과제 - 기본 1" src="https://user-images.githubusercontent.com/38368820/80300530-8dce1380-87d8-11ea-957a-f618caec0247.png">

#### Constraint Dimension Ratio [🔗](https://constraintlayout.com/basics/dimensions.html)
원하는 비율로 자동으로 크기 조절
```xml
<ImageView
        android:layout_width="0dp"
        android:layout_height="0dp"
        app:layout_constraintDimensionRatio="1:1"
        .../>
```

### 기본 2️⃣ 회원가입 및 로그인 기능 구현 & 성장 2️⃣ 자동 로그인 구현
<img src="https://user-images.githubusercontent.com/38368820/80303320-75ff8b00-87ea-11ea-8eb2-fd2392ba7ac6.png">

#### startActivityForResult, intent.putExtra
1. startActivityForResult()로 Activity 호출하기
```kotlin
startActivityForResult(Intent(this, NextActivity::class.java), REQUEST_TEST);
```

2. 호출된 Activity에서 setResult()로 결과 돌려주기
```kotlin
Intent intent = new Intent();
intent.putExtra("result", "some value");
setResult(RESULT_OK, intent);
finish();
```

3. onActivityResult()에서 결과 확인하기
```kotlin
@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);

    if (requestCode == REQUEST_TEST) {
        if (resultCode == RESULT_OK) {
            
        } else {   // RESULT_CANCEL
            
        }
    } else if (requestCode == REQUEST_ANOTHER) {
        ...
    }
}
```

#### SharedPreferences [🔗](https://developer.android.com/training/data-storage/shared-preferences)<br/>
간단한 데이터를 저장하기 위해 앱 내 파일 형태로 저장
1. Controller 파일 작성
```kotlin
object SharedPreferenceController {
    private val KEY : String = "key"

    /**
     * Key
     * String
     */
    fun putKey(ctx: Context, input: String) {
        val preferences : SharedPreferences = ctx.getSharedPreferences(KEY, Context.MODE_PRIVATE)
        val editor : SharedPreferences.Editor = preferences.edit()
        editor.putString(KEY, input)
        editor.commit()
    }

    fun getKey(ctx : Context) : String {
        val preferences : SharedPreferences = ctx.getSharedPreferences(KEY, Context.MODE_PRIVATE)
        return preferences.getString(KEY, "")!!
    }
    
    fun removeKey(ctx : Context) {
        val preferences : SharedPreferences = ctx.getSharedPreferences(KEY, Context.MODE_PRIVATE)
        val editor : SharedPreferences.Editor = preferences.edit()
        editor.remove(KEY)
        editor.commit()
    }
}
```
2. 데이터 저장 
```kotlin
SharedPreferenceController.putKey(this, "key value")
```
3. 데이터 조회
```kotlin
SharedPreferenceController.getKey(this)
```
4. 데이터 삭제
```kotlin
SharedPreferenceController.removeKey(this)
```

<br/>

## 2차 세미나 정리
### 1. 라이브러리
- 재사용의 가치가 있는 코드들을 다른 사람(또는 본인)이 작성해놓은 것
- build.gradle의 Dependencies 안에 라이브러리 코드 추가
<br/>

## 2차 세미나 과제
### 기본 1️⃣ Bottom Navigation, ViewPager, RecyclerView 실습
<img width="290" alt="" src="https://user-images.githubusercontent.com/38368820/80577185-6c239500-8a41-11ea-9192-28a8891d8cb4.gif">

#### scaleType 속성
- ImageView 영역에 맞게 이미지의 크기를 확대, 축소, 이동 가능
- default 값은 `fitCenter`

||내용|비율 유지|
|:---:|---|:---:|
|**matrix**|Image Matrix를 사용하여 이미지 표시<br/>* Image Maxtrix는 ImageView의 크기에 따라 이미지를 어떠한 형태로 변환하여 표시할 것인지를<br/>지정한 값으로, 개발자가 직접 이미지의 크기 조절, 위치 변경, 원근감 왜곡 등의 효과를 줄 수 있음|지정 가능|
|**fitXY**|가로(X), 세로(Y) 방향으로 이미지를 확대 또는 축소하여 ImageView의 크기에 가득 채워 표시|❌|
|**fitStart**|ImageView 영역 내에 모두 표시되도록 확대 또는 축소한 다음 ImageView의 Start(Left, Top)<br/>기준으로 표시|⭕️|
|**fitCenter**|ImageView 영역 내에 모두 표시되도록 확대 또는 축소한 다음 ImageView의 Center 기준으로 표시|⭕️|
|**fitEnd**|ImageView 영역 내에 모두 표시되도록 확대 또는 축소한 다음 ImageView의 End(Right, Bottom)<br/>기준으로 표시|⭕️|
|**center**|이미지의 크기를 확대 또는 축소하지 않고 원본 이미지 그대로 ImageView의 Center 기준으로 표시|⭕️|
|**centerCrop**|이미지가 ImageView보다 크거나 같게 만든 다음 ImageView의 Center 기준으로 표시<br/>크기 조절 후 ImageView의 크기를 벗어나는 이미지 영역은 잘려나가며(Crop) 화면에 표시되지 않음|⭕️|
|**centerInside**|ImgeView보다 작거나 같게 만든 다음 ImageView의 Center 기준으로 표시<br/>원본 이미지 크기가 ImageView보다 작은 경우 이미지 크기를 늘리지 않음|⭕️|


### 기본 2️⃣ RecyclerView의 itemDecoration, clipToPadding
<img width="1000" alt="" src="https://user-images.githubusercontent.com/38368820/80575449-93c52e00-8a3e-11ea-8e75-4e3d58cf5b56.png">

#### itemDecoration
- RecyclerView 내부에 있는 추상 클래스
- RecyclerView의 아이템을 꾸미는 역할
1. ItemDecoration 클래스 생성
```kotlin
class ItemDecoration(context: Context) : RecyclerView.ItemDecoration() { 
  //데코레이션 할 코드
}
```
2. 리사이클러뷰에 적용
```kotlin
recycelrview.addItemDecoration(ItemDecoration(context))
```
#### clipToPadding
- 리사이클러뷰에 패딩을 적용할 때, 스크롤 시에는 패딩이 없도록
RecyclerView의 xml 파일 내에 아래 속성 추가
```xml
android:clipToPadding="false"
```
### 성장 1️⃣ 네이버 웹툰 뷰
<br/>

## 3차 세미나 정리

<br/>

## 3차 세미나 과제

<br/>

## 4차 세미나 정리

<br/>

## 4차 세미나 과제

<br/>

## 5차 세미나 정리

<br/>

## 5차 세미나 과제

<br/>

## 6차 세미나 정리

<br/>

## 6차 세미나 과제

<br/>

## 7차 세미나 정리

<br/>

## 7차 세미나 과제

<br/>

## 8차 세미나 정리

<br/>

## 8차 세미나 과제

