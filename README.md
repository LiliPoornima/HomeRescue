# HomeRescue

A comprehensive Android application that connects homeowners with professional home service providers. HomeRescue makes your house a home by offering easy access to various home maintenance and improvement services.

## 🏠 About

HomeRescue is a user-friendly Android app designed to simplify the process of finding and booking home services. Whether you need electrical work, plumbing, cleaning, roofing, gardening, or cooking services, HomeRescue provides a seamless platform to connect with qualified professionals.

## ✨ Features

### Core Services
- **Electrical Services** - Professional electrical repairs and installations
- **Plumbing Services** - Expert plumbing solutions and maintenance
- **Cleaning Services** - Comprehensive home cleaning and maintenance
- **Roofing Services** - Roof repairs, installations, and maintenance
- **Gardening Services** - Landscape design and garden maintenance
- **Cooking Services** - Professional cooking and catering services

### App Features
- **User Authentication** - Secure login and signup system
- **Intuitive UI** - Modern, user-friendly interface with smooth navigation
- **Service Categories** - Easy-to-browse service categories with visual icons
- **Responsive Design** - Optimized for various Android device sizes
- **Edge-to-Edge Display** - Modern Android UI with edge-to-edge support

## 🛠️ Technical Details

### Technology Stack
- **Language**: Kotlin
- **Platform**: Android
- **Minimum SDK**: API 24 (Android 7.0)
- **Target SDK**: API 35 (Android 15)
- **Architecture**: Activity-based navigation
- **UI Framework**: AndroidX with ConstraintLayout

### Project Structure
```
HomeRescueNw/
├── app/
│   ├── src/main/
│   │   ├── java/com/example/homerescuenw/
│   │   │   ├── MainActivity.kt          # App entry point
│   │   │   ├── IntroOne.kt             # First intro screen
│   │   │   ├── IntroTwo.kt             # Second intro screen
│   │   │   ├── IntroEnter.kt           # Entry screen
│   │   │   ├── Login.kt                # Login functionality
│   │   │   ├── Signup.kt               # Registration
│   │   │   └── Home.kt                 # Main service selection
│   │   ├── res/
│   │   │   ├── layout/                 # UI layouts
│   │   │   ├── drawable/               # Images and icons
│   │   │   └── values/                 # Strings and themes
│   │   └── AndroidManifest.xml
│   └── build.gradle.kts
└── build.gradle.kts
``

## 🚀 Getting Started

### Prerequisites
- Android Studio (latest version)
- Android SDK (API 24 or higher)
- Java Development Kit (JDK 11)

### Installation

1. **Clone the repository**
   ``bash
   git clone https://github.com/yourusername/HomeRescue.git
   cd HomeRescue
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Open the `HomeRescueNw` folder as a project

3. **Sync and Build**
   - Wait for Gradle sync to complete
   - Build the project (Build → Make Project)

4. **Run the App**
   - Connect an Android device or start an emulator
   - Click the "Run" button or press Shift+F10

### Building for Release

1. **Generate Signed APK**
   - Build → Generate Signed Bundle/APK
   - Choose APK option
   - Create or select a keystore
   - Choose release build variant

2. **Install on Device**
   - Transfer the generated APK to your device
   - Enable "Install from Unknown Sources" in device settings
   - Install the APK
  
  
<img width="557" height="391" alt="hr11" src="https://github.com/user-attachments/assets/b128ece6-b9ff-465d-bece-9e988eea59f3" />
<img width="571" height="822" alt="hr2" src="https://github.com/user-attachments/assets/38752343-1ec7-42f1-bd59-fa971df672a9" />
<img width="591" height="853" alt="hr3" src="https://github.com/user-attachments/assets/0f36d054-c76d-4bdd-8a82-0bf5b545e081" />
<img width="408" height="447" alt="hr4" src="https://github.com/user-attachments/assets/50ca4171-e10d-46ea-be17-ae89b43e6bbb" />

## 📱 Usage

### App Flow
1. **Launch** - Start the app to see the welcome screen
2. **Introduction** - Navigate through intro screens
3. **Authentication** - Login or create a new account
4. **Service Selection** - Choose from available home services
5. **Service Booking** - Select specific services and providers

### Navigation
- **Main Screen**: App logo and "Let's Go" button
- **Intro Screens**: App introduction and features
- **Login/Signup**: User authentication
- **Home Screen**: Service category selection with visual icons

## 🎨 UI/UX Features

- **Modern Design**: Clean, intuitive interface with professional styling
- **Visual Service Icons**: Easy-to-recognize service category icons
- **Responsive Layout**: Adapts to different screen sizes
- **Smooth Navigation**: Seamless transitions between screens
- **Color-Coded Services**: Each service category has distinct colors

## 🔧 Development

### Key Components

#### Activities
- `MainActivity`: App entry point with welcome screen
- `IntroOne/IntroTwo`: Introduction screens
- `IntroEnter`: Entry point after intro
- `Login`: User authentication
- `Signup`: User registration
- `Home`: Main service selection interface

#### Layouts
- `activity_main.xml`: Welcome screen layout
- `activity_home.xml`: Service selection grid
- `activity_login.xml`: Login form
- `activity_signup.xml`: Registration form

### Customization

#### Adding New Services
1. Add service icon to `res/drawable/`
2. Update `activity_home.xml` with new service button
3. Add corresponding activity for service details
4. Update `AndroidManifest.xml` with new activity

#### Styling
- Colors are defined in `res/values/colors.xml`
- Styles are in `res/values/themes.xml`
- Strings are in `res/values/strings.xml`
- 

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📞 Support

For support and questions:
- Create an issue in the GitHub repository
- Contact the development team
- Check the documentation for common issues

## 🔮 Future Enhancements

- [ ] Real-time service provider matching
- [ ] In-app messaging system
- [ ] Payment integration
- [ ] Service history and reviews
- [ ] Push notifications
- [ ] Offline mode support
- [ ] Multi-language support

---

**HomeRescue** - Making your house a home, one service at a time.
