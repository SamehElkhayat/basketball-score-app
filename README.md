📱 Basketball Score App
A simple Android application to track basketball scores between two teams using MVVM architecture with ViewModel and LiveData.

✅ Features
📊 Real-time score updates for Team A and Team B.

🏀 Three types of scoring options:

+3 Points

+2 Points

Free Throw (+1 Point)

🏁 End Game button shows the winner using a Snackbar.

🔄 Reset button to reset scores for both teams.

📱 Responsive design for portrait and landscape modes.

🛠️ Tech Stack
Kotlin

Android View Binding

ViewModel + LiveData

Material Design Components

ConstraintLayout

📂 Project Structure
perl
Copy
Edit
├── ui/
│   └── MainActivity.kt       # UI logic and user interactions
├── viewmodel/
│   └── CounterViewModel.kt   # Holds score logic for both teams
├── res/
│   ├── layout/
│   │   └── activity_main.xml      # Main layout
│   ├── layout-land/
│   │   └── activity_main.xml      # Landscape layout
│   ├── values/
│   │   ├── colors.xml
│   │   └── strings.xml
│   └── drawable/
│       └── basketballbg.png       # Background image
📸 Screenshots
(You can add screenshots here to showcase UI in portrait and landscape)

🚀 Getting Started
Clone the repo:

bash
Copy
Edit
git clone https://github.com/your-username/basketball-score-app.git
Open in Android Studio.

Run the app on an emulator or device.

🤝 Contributions
Pull requests and feature suggestions are welcome!

📄 License
This project is open-source and free to use under the MIT License.
