# react-native-progress-dialog-android

React native android module to present progress dialog.

### Installation

```bash
npm install --save react-native-progress-dialog-android
```

### Add it to your android project

* In `android/setting.gradle`

```gradle
...
include ':dyprogressdialogandroid', ':app'
project(':dyprogressdialogandroid').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-progress-dialog-android')
```

* In `android/app/build.gradle`

```gradle
...
dependencies {
    ...
    compile project(':dyprogressdialogandroid')
}
```

* register module (in MainActivity.java)

```java
import com.damonyuan.dyprogressdialogandroid.DYProgressDialogAndroidPackage;  // <--- import

public class MainActivity extends Activity implements DefaultHardwareBackBtnHandler {
  ......

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mReactRootView = new ReactRootView(this);

    mReactInstanceManager = ReactInstanceManager.builder()
      .setApplication(getApplication())
      .setBundleAssetName("index.android.bundle")
      .setJSMainModuleName("index.android")
      .addPackage(new MainReactPackage())
      .addPackage(new DYProgressDialogAndroidPackage())              // <------ add here
      .setUseDeveloperSupport(BuildConfig.DEBUG)
      .setInitialLifecycleState(LifecycleState.RESUMED)
      .build();

    mReactRootView.startReactApplication(mReactInstanceManager, "Example", null);

    setContentView(mReactRootView);
  }

  ......

}
```

## Example
```javascript
var ProgressDialog = require('react-native-progress-dialog-android');

ProgressDialog.createDialog();
```
## License

MIT