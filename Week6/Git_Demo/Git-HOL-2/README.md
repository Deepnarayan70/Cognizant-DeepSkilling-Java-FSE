# Git Hands-on 2

## Objective

Learn how to use `.gitignore` to exclude unnecessary files and folders from being tracked by Git.

---

## Steps Completed

- Initialized a local Git repository.
- Created sample log files (`app.log` and `error.log`).
- Created a `log` directory containing `server.log`.
- Created a sample file `welcome.txt`.
- Added a `.gitignore` file.
- Configured Git to ignore all `.log` files and the `log` directory.
- Verified that ignored files were not tracked by Git.
- Added the required project files to the staging area.
- Committed the changes.
- Connected the repository to GitHub.
- Successfully pushed the repository to the remote repository.

---

## Commands Used

```bash
git init

git status

mkdir log

echo "Application Log" > app.log

echo "Error Log" > error.log

echo "Log Folder File" > log/server.log

echo "Hello Git" > welcome.txt

git status

git add .

git commit -m "Added .gitignore to ignore log files"

git remote add origin https://github.com/Deepnarayan70/GitIgnoreDemo.git

git branch -M main

git push -u origin main
```

---

## Project Structure

```
GitIgnoreDemo/
│
├── .gitignore
├── welcome.txt
├── app.log
├── error.log
└── log/
    └── server.log
```

---

## .gitignore

```gitignore
*.log
log/
```

---

## Result

- Successfully configured `.gitignore` to exclude unnecessary files.
- Verified that all `.log` files and the `log` directory were ignored.
- Committed only the required project files.
- Successfully pushed the repository to GitHub.

---

## Author

**Deep Narayan**

GitHub: https://github.com/Deepnarayan70
