# Git Hands-on 2
## Objective
Learn how to use .gitignore to ignore unwanted files and folders from being tracked by Git.

Steps Completed
Created a local Git repository.
Created .log files (app.log, error.log).
Created a log folder containing server.log.
Created a normal file welcome.txt.
Created a .gitignore file.
Added the following ignore rules:
*.log
log/
Verified that Git ignored all .log files and the log directory.
Added only the required files to Git.
Committed the changes.
Connected the local repository with GitHub.
Pushed the repository successfully.
Commands Used
git init
git status

mkdir log

echo "Application Log" > app.log
echo "Error Log" > error.log
echo "Log Folder File" > log/server.log
echo "Hello Git" > welcome.txt

git add .
git status

git commit -m "Added .gitignore to ignore log files"

git remote add origin https://github.com/Deepnarayan70/GitIgnoreDemo.git
git branch -M main
git push -u origin main
Files Created
GitIgnoreDemo/
│
├── .gitignore
├── welcome.txt
├── app.log
├── error.log
└── log/
    └── server.log
.gitignore Contents
*.log
log/
Result
Successfully ignored all .log files.
Successfully ignored the log directory.
Only the required project files were committed to Git.
Repository successfully pushed to GitHub.
