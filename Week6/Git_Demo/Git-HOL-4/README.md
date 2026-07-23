# Git Hands-on 4

## Objective

Learn how to resolve merge conflicts in Git by creating conflicting changes in different branches, manually resolving the conflict, updating the `.gitignore` file, and completing the merge process.

---

## Steps Completed

- Initialized a new Git repository.
- Created `hello.xml` and committed the initial version.
- Renamed the default branch to `main`.
- Created a new branch named `GitWork`.
- Modified `hello.xml` in the `GitWork` branch and committed the changes.
- Switched back to the `main` branch.
- Modified `hello.xml` with different content and committed the changes.
- Viewed the commit history using the Git log graph.
- Compared the differences between the branches using `git diff`.
- Merged the `GitWork` branch into `main`, which resulted in a merge conflict.
- Resolved the merge conflict manually by editing the file.
- Committed the resolved merge.
- Created a `.gitignore` file to ignore backup (`*.bak`) files.
- Committed the updated `.gitignore`.
- Deleted the merged branch.
- Viewed the final commit history.
- Connected the local repository to GitHub.
- Successfully pushed the repository to GitHub.

---

## Commands Used

```bash
git init

git status

echo "<message>Hello Git</message>" > hello.xml

git add .

git commit -m "Initial hello.xml"

git branch -M main

git branch GitWork

git checkout GitWork

git add .

git commit -m "Updated hello.xml in GitWork"

git checkout main

git add .

git commit -m "Updated hello.xml in main"

git log --oneline --graph --decorate --all

git diff main GitWork

git merge GitWork

git add .

git commit -m "Resolved merge conflict"

git add .

git commit -m "Added backup files to .gitignore"

git branch

git branch -d GitWork

git log --oneline --graph --decorate

git remote add origin https://github.com/Deepnarayan70/GitConflictDemo.git

git push -u origin main
```

---

## Project Structure

```text
GitConflictDemo/
│
├── hello.xml
└── .gitignore
```

---

## .gitignore

```gitignore
*.bak
```

---

## Merge Conflict Workflow

```text
main
 │
 ├── Initial Commit
 │
 ├──────────────┐
 │              │
 ▼              ▼
main         GitWork
 │              │
 │      Modified hello.xml
 │              │
Modified hello.xml
 │              │
 └──── Merge Conflict ────┐
                          │
                Resolve Conflict
                          │
                          ▼
                 Commit Merged Changes
                          │
                          ▼
                Delete GitWork Branch
```

---

## Result

- Successfully created and managed multiple branches.
- Generated and resolved a merge conflict manually.
- Compared branch differences using `git diff`.
- Updated `.gitignore` to ignore backup files.
- Deleted the merged branch successfully.
- Connected the local repository to GitHub.
- Successfully pushed the project to GitHub.

---

## Author

**Deep Narayan**

GitHub: https://github.com/Deepnarayan70
