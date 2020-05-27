# 📌 SOPT 26th Android Seminar 🤳🏻📱
세미나 내용과 과제, 스스로 알아본 내용을 정리하는 저장소 👩🏻‍💻 　　　　　　　　 　　　　　`👇🏻click emoji👇🏻`
||내용|날짜|자료|정리|과제|
|---|---|:---:|:---:|:---:|---|
|**1차 보충 세미나**|Kotlin 기초|20.04.18|[📊](https://github.com/HyeranShin/SOPT-26th-Android/blob/master/1stSeminar/1차%20보충%20세미나.pdf)|[✏️](#1차-보충-세미나-정리)|-|20.04.18|
|**1차 세미나**|각종 레이아웃의 활용, 로그인과 회원가입 화면 완성|20.04.18|[📊](https://github.com/HyeranShin/SOPT-26th-Android/blob/master/1stSeminar/1차%20세미나%20-%20각종%20레이아웃의%20활용.pdf)|[](#1차-세미나-정리)|[🏠](#1차-세미나-과제)|
|**2차 세미나**|Bottom Navigation, ViewPager, RecyclerView|20.04.25|[📊](https://github.com/HyeranShin/SOPT-26th-Android/blob/master/2ndSeminar/2차%20세미나%20-%20Bottom%20Navigation%2C%20ViewPager%2C%20RecyclerView.pdf)|[✏️](#2차-세미나-정리)|[🏠](#2차-세미나-과제)|
|**3차 세미나**|Open API를 이용한 Retrofit2|20.05.09|[📊](https://github.com/HyeranShin/SOPT-26th-Android/blob/master/3rdSeminar/3차%20세미나%20-%20Retrofit2의%20활용.pdf)|[✏️](#3차-세미나-정리)|[](#3차-세미나-과제)|
|**4차 세미나**|자주 쓰이는 기능들에 대하여|20.05.16|[📊](https://github.com/HyeranShin/SOPT-26th-Android/blob/master/4thSeminar/4차%20세미나%20-%20자주%20쓰이는%20기능들.pdf)|[](#4차-세미나-정리)|[](#4차-세미나-과제)|
|**5차 세미나**|디자인 합동 세미나|20.05.23|-|-|[](#5차-세미나-과제)|
|**6차 세미나**|서버 합동 세미나|20.05.30|[]()|[](#6차-세미나-정리)|[](#6차-세미나-과제)|
|**7차 세미나**|||[]()|[](#7차-세미나-정리)|[](#7차-세미나-과제)|
|**8차 세미나**|||[]()|[](#8차-세미나-정리)|[](#8차-세미나-과제)|

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
### 라이브러리
- 재사용의 가치가 있는 코드들을 다른 사람(또는 본인)이 작성해놓은 것
- build.gradle의 Dependencies 안에 라이브러리 코드 추가

### RecyclerView
#### 구현 방법
1. Dependency 추가
```gradle
implementation 'androidx.recyclerview:recyclerview:1.1.0'
```
2. 반복될 뷰 만들기 (item_rv.xml)
3. activity layout에 위젯 추가
```xml
<androidx.recyclerview.widget.RecyclerView
    android:id="@+id/recyclerview"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:clipToPadding="false"
    app:layoutManager="androidx.recyclerview.widget.LinearLayoutManager"
    android:orientation="vertical"
    tools:listitem="@layout/item_rv"/>
```
4. Data Class 만들기
- 데이터 형태
```kotlin
data class ItemData(
    val profile: String,
    val name: String
)
```
5. ViewHolder 만들기
- 데이터와 뷰 연결
```kotlin
class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val iv_profile = itemView.findViewById<ImageView>(R.id.iv_profile_item_rv)
    val tv_name = itemView.findViewById<TextView>(R.id.tv_name_item_rv)

    fun bind(itemData: itemData) {
        Glide.with(itemView).load(itemData.profile).into(iv_profile)
        tv_name.text = itemData.name
    }
}
```
6. Adapter 만들기
- 데이터 리스트 중 하나 전달
```kotlin
class ItemAdapter(private val context: Context) : RecyclerView.Adapter<ItemViewHolder>() {
    var dataList = mutableListOf<ItemData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_rv, parent, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(dataList[position])
    }
}
```
7. Activity에서 RecyclerView와 Adpater 연결
```kotlin
val hearSignalItemAdapter = HearSignalItemAdapter(this)
rv_heartsignal.adapter = hearSignalItemAdapter
hearSignalItemAdapter.dataList = dataList
hearSignalItemAdapter.notifyDataSetChanged()
```

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
### Server와 Client
#### 사용자 → Client
- **사용자의 Action**
- 사용자의 클릭 이벤트 감지 및 해당 로직 처리
- 사용자에게 화면을 그려줌
- 로딩 화면을 보여줌
- 받은 데이터를 사용자가 보기 좋게 화면에 적절히 그려줌
#### Client → Server
- **서버에게 데이터 요청 / 전달**
- ex) 로그인을 위해 유저가 입력한 아이디, 비밀번호 데이터 전달
- ex) 인스타 새로운 소식 받아오도록 요청
#### Server → Client
- **서버로부터 응답 / 에러를 받음**
- ex) 로그인 성공 / 실패 여부
- ex) 인스타 피드 데이터
#### Client → 사용자
- **받은 데이터를 화면에 그려줌**
- ex) 로그인에 성공했습니다! 토스트
- ex) 인스타 새로운 사진
### Json
- 서버와 클라이언트가 대화를 나누는 언어
- 서버와 데이터 요청 및 수신이 이루어지는 언어
```json
[
  {
    "이름": "교촌치킨",
    "대표메뉴": ["허니콤보", "반반콤보"],
    "평점": 4.5
  },
  {
    "이름": "굽네치킨",
    "대표메뉴": ["고추바사삭", "볼케이노"],
    "평점": 4.5
  }
]
```
#### 장점
- **텍스트**로 이루어져 있어 기계, 사람 모두 이해하기 쉬움
- 프로그래밍 **언어와 플랫폼에 독립적** → 서로 다른 시스템간에 객체를 교환하기 좋음
#### 기본 자료형
- Number(정수, 실수) *8진수나 16진수는 지원 X
- 문자열
- Boolean(true / false)
- 배열
  - [] 대괄호로 정의
  - 아무 자료형이나 들어갈 수 있음
- 객체
  - {} 중괄호로 정의
  - 키 값은 문자열
  - 키 값을 이용해서 실제 값에 접근 가능
- Null
### 동기와 비동기
#### 동기(Synchronous Processing Model)
- **직렬적**으로 태스크 수행
- 어떤 작업이 수행 중이면 **다음 작업은 대기**
- ex) 서버에서 데이터를 가져와 화면에 표시하는 작업을 수행할 때, 서버에 데이터를 요청하고 데이터가 응답될 때까지 **이후 태스크들은 블로킹(작업 중단)**
#### 비동기(Asynchronous Processing Model)
- **병렬적**으로 태스크 수행
- 어떤 작업이 수행 중이더라도 **다음 태스크를 실행**
- ex) 서버에서 데이터를 가져와 화면에 표시하는 작업을 수행할 때, 서버에 데이터를 요청하고 데이터가 응답될 때까지 **대기하지 않고 즉시 다음 태스크 수행** <br/>→ 이후 서버로부터 데이터가 응답되면 이벤트 발생
### Restful API
- REpresentational State Transfer : HTTP 장점을 최대한 활용할 수 있는 아키텍처
- **서버에 존재하는 데이터에 접근하기 위한 대표적인 규칙**
1. 자원(Resource) - URI(http://서버 이름/자원 식별)
2. 행위(Verb) - HTTP Method
   - GET : 데이터 자체 단순 요구
   - POST : 데이터 제출, 서버의 상태 변화
   - PUT : 데이터 변경
   - DELETE : 데이터 삭제
### Retrofit의 활용
- 공식 문서: http://devflow.github.io/retrofit-kr/
0. 서버와 필요한 데이터 논의
1. 라이브러리 추가
```groovy
//Retrofit 라이브러리 : https://github.com/square/retrofit 
implementation 'com.squareup.retrofit2:retrofit:2.6.2' 
//Retrofit 라이브러리 응답으로 가짜 객체를 만들기 위해 
implementation 'com.squareup.retrofit2:retrofit-mock:2.6.2'

//객체 시리얼라이즈를 위한 Gson 라이브러리 : https://github.com/google/gson
implementation 'com.google.code.gson:gson:2.8.6'
//Retrofit 에서 Gson 을 사용하기 위한 라이브러리 
implementation 'com.squareup.retrofit2:converter-gson:2.6.2'
```
manifest
```xml
<uses-permission android:name="android.permission.INTERNET" />

<application
    android:usesCleartextTraffic="true" <!--http 허용-->
```
2. API 문서 보고 Request / Response 객체 설계
```kotlin
data class LoginResponseDto(
    val status: Int,
    val success: Boolean,
    val message: String,
    @SerializaedName("data") //서버에서 지어준 이름 지정해주면 원하는 변수명으로 변경 가능
    val responseData: SomeData?
    //필요없는 데이터는 변수 만들지 않아도됨 
)
```
3. Retrofit Interface 설계
```kotlin
interface RequestInterface {
    @GET("/group/{id}/users")
    fun groupList(@Path("id") groupId: Int, @Query("sort") sort: String) : Call<List<User>>
    
    @Headers("Content-Type: application/json") //정적 헤더
    @Get("/user")           //동적 헤더
    fun getUser(@Header("Authorization") authorization: String) : Call<User>
    
    @POST("/users/new")
    fun createUser(@Body user: User) : Call<User>
    
    @Multipart
    @PUT("/user/photo")
    fun updateUser(@Part("photo") photo: RequestBody) : Call<User>
}
```
4. Retrofit Interface 실제 구현체 만들기
```kotlin
//싱글톤. 코드 아무데서나 접근 가능, 객체는 단 하나만 생성
object RequestToServer {
    private val retrofit = Retrofit.Builder()
        .baseUrl("http://~")
        .addConverterFactory(GsonConverterFactory.create()) //Retrofit으로 받아온 json 데이터를 데이터 클래스로 변환하기 쉽게
        .build()
        
    //retrofit 객체의 create 호출. Interface 클래스 타입을 넘겨 실제 구현체를 만들어줌
    val service: RequestInterface = retrofit.create(RequestInterface::class.java)
}
```
5. Callback 등록하며 통신 요청
```kotlin
private val requestToServer = RequestToServer

private fun setRetrofit() {
    requestToServer.createUser(
        User(
            name="hyeran",
            age=24
        )   //Request 정보 전달 → Call 타입 리턴
    ).enqueue(object: Callback<ResponseDto> { //실제 서버 통신을 비동기적으로 요청
        override fun onFailure(call: Call<ResponseDto>, t: Throwable) {
            //비동기 통신 중 발생한 에러
        }
        
        override fun onResponse( //비동기 요청 후 응답 받았을 때 수행할 행동
            call: Call<ResponseDto>,
            response: Response<ResponseDto>
        ) {
            //통신 성공
            if(response.isSuccessful) { //statusCode가 200~300
                
            } else {
            
            }
        }
    })
}
```

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

