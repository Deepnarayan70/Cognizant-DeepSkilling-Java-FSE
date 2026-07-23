# Git Hands-on 1
## Objective
Familiarize with Git commands like git init, git status, git add, git commit, git push, and git pull.

Steps Completed
Verified Git installation using git --version
Configured global username and email
Configured VS Code as the default Git editor
Created a local Git repository using git init
Created welcome.txt
Staged the file using git add
Committed the file using git commit
Added the GitHub remote repository
Pushed the local repository to GitHub
Commands Used
git --version
git config --global user.name "Jeet Lohar"
git config --global user.email "jeetloharcrj@gmail.com"
git config --global core.editor "code --wait"
git init
echo "Welcome to the version control" > welcome.txt
git status
git add welcome.txt
git commit -m "Initial Commit"
git log
git remote add origin https://github.com/Jeet-Lohar-29/GitDemo.git
git branch -M main
git push -u origin main
Result
The local repository was successfully created and pushed to GitHub.