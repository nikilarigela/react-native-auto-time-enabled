
# react-native-auto-time-enabled

## Getting started

`$ npm install react-native-auto-time-enabled --save`

### Mostly automatic installation

`$ react-native link react-native-auto-time-enabled`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-auto-time-enabled` and add `RNAutoTimeEnabled.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNAutoTimeEnabled.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNAutoTimeEnabledPackage;` to the imports at the top of the file
  - Add `new RNAutoTimeEnabledPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-auto-time-enabled'
  	project(':react-native-auto-time-enabled').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-auto-time-enabled/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-auto-time-enabled')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNAutoTimeEnabled.sln` in `node_modules/react-native-auto-time-enabled/windows/RNAutoTimeEnabled.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Auto.Time.Enabled.RNAutoTimeEnabled;` to the usings at the top of the file
  - Add `new RNAutoTimeEnabledPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNAutoTimeEnabled from 'react-native-auto-time-enabled';

// TODO: What to do with the module?
RNAutoTimeEnabled;
```
  