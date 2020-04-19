# 1st Seminar Assignment
<img alt="1차 세미나 과제 화면 플로우" src="https://user-images.githubusercontent.com/38368820/79688897-5cab8b80-828c-11ea-9b1d-2627eb60c434.png">

### 기본 1. ConstraintLayout 심화 학습

[Constraint Dimension Ratio](https://constraintlayout.com/basics/dimensions.html)<br/>
원하는 비율로 자동으로 크기 조절

```xml
<ImageView
        android:layout_width="0dp"
        android:layout_height="0dp"
        app:layout_constraintDimensionRatio="1:1"
        .../>
```

<br/>

### 기본 2. 회원가입 및 로그인 기능 구현
1. startActivityForResult()로 Activity 호출하기
```kotlin
startActivityForResult(intent, REQUEST_TEST);
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

<br/>

### 성장 2. 자동 로그인 구현
SharedPreferences 사용<br/>
1. Controller 파일 작성
```kotlin
object SharedPreferenceController {
    private val KEY : String = "key"

    /**
     * KEY
     * String
     */
    fun setKEY(ctx: Context, input: String) {
        val preferences : SharedPreferences = ctx.getSharedPreferences(KEY, Context.MODE_PRIVATE)
        val editor : SharedPreferences.Editor = preferences.edit()
        editor.putString(KEY, input)
        editor.commit()
    }

    fun getKEY(ctx : Context) : String {
        val preferences : SharedPreferences = ctx.getSharedPreferences(KEY, Context.MODE_PRIVATE)
        return preferences.getString(KEY, "")!!
    }
}
```
2. 데이터 저장 
```kotlin
SharedPreferenceController.setKEY(this, "key value")
```
3. 데이터 조회
```kotlin
SharedPreferenceController.getKEY(this)
```
