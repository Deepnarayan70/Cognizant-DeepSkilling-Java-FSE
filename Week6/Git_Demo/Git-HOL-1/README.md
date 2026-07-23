# Git Hands-on 1

## Objective

Familiarize with basic Git commands such as:

- `git init`
- `git status`
- `git add`
- `git commit`
- `git push`
- `git pull`

---

## Steps Completed

- Verified Git installation using `git --version`
- Configured global username and email
- Configured VS Code as the default Git editor
- Created a local Git repository using `git init`
- Created a file named `welcome.txt`
- Staged the file using `git add`
- Committed the changes using `git commit`
- Added the GitHub remote repository
- Pushed the local repository to GitHub

---

## Commands Used

```bash
git --version

git config --global user.name "Jeet Lohar"

git config --global user.email "deepnaryan03@gmail.com"

git config --global core.editor "code --wait"

git init

echo "Welcome to the version control" > welcome.txt

git status

git add welcome.txt

git commit -m "Initial Commit"

git log

git remote add origin https://github.com/Deepnarayan70/GitDemo.git

git branch -M main

git push -u origin main
```

---

## Result

- Successfully installed and configured Git.
- Created a local Git repository.
- Added and committed project files.
- Connected the repository to GitHub.
- Successfully pushed the local repository to the remote GitHub repository.
