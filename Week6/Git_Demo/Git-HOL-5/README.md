# Git Hands-on 5

## Objective

Learn how to synchronize a local Git repository with a remote repository by performing pull and push operations.

---

## Steps Completed

- Cloned an existing GitHub repository to the local machine.
- Verified the repository status using Git.
- Listed all available local and remote branches.
- Pulled the latest changes from the remote repository.
- Modified the project files locally.
- Verified the repository status after making changes.
- Staged and committed the updated files.
- Pushed the committed changes to the remote GitHub repository.
- Verified that the repository was successfully synchronized.

---

## Commands Used

```bash
git clone https://github.com/Deepnarayan70/GitConflictDemo.git

cd GitConflictDemo

git status

git branch

git branch -a

git pull origin main

git status

git add .

git commit -m "Verified remote synchronization"

git push origin main
```

---

## Project Structure

```text
GitConflictDemo/
│
└── hello.xml
```

---

## Git Synchronization Workflow

```text
Remote Repository
        │
        │ git clone
        ▼
Local Repository
        │
        │ Modify Files
        ▼
git add
        │
        ▼
git commit
        │
        ▼
git pull
        │
        ▼
git push
        │
        ▼
Updated Remote Repository
```

---

## Result

- Successfully cloned the remote GitHub repository.
- Pulled the latest changes to keep the local repository up to date.
- Modified, staged, and committed the project files.
- Successfully synchronized the local repository with the remote repository using Git commands.

---

## Author

**Deep Narayan**

GitHub: https://github.com/Deepnarayan70
