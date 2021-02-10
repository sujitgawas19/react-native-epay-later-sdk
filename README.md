
# react-native-epay-later

## Getting started

`$ npm install react-native-epay-later --save`

### Mostly automatic installation

`$ react-native link react-native-epay-later`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.epaylater.RNEpayLaterPackage;` to the imports at the top of the file
  - Add `new RNEpayLaterPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-epay-later'
  	project(':react-native-epay-later').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-epay-later/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-epay-later')
  	```


## Usage
```javascript
import RNEpayLater from 'react-native-epay-later';

// TODO: What to do with the module?
RNEpayLater;
```
  