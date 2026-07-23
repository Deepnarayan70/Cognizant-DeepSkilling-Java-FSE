# Git Hands-on 3

## Objective

Learn Git branching and merging by creating a new branch, making changes, comparing branches, merging the branch into the main branch, and deleting the merged branch.

---

## Steps Completed

- Initialized a local Git repository.
- Created the initial file `welcome.txt`.
- Committed the initial version to the `main` branch.
- Created a new branch named `GitNewBranch`.
- Switched to the new branch.
- Modified the `welcome.txt` file.
- Committed the changes in `GitNewBranch`.
- Verified the repository status.
- Switched back to the `main` branch.
- Compared the differences between `main` and `GitNewBranch`.
- Merged `GitNewBranch` into the `main` branch.
- Viewed the commit history using the Git log graph.
- Deleted the merged branch.
- Connected the local repository to GitHub.
- Successfully pushed the repository to GitHub.

---

## Commands Used

```bash
git init

git status

echo "This is the Main Branch" > welcome.txt

git add .

git commit -m "Initial Commit"

git branch -M main

git branch GitNewBranch

git branch

git checkout GitNewBranch

Add-Content welcome.txt "This line was added in GitNewBranch"

git status

git add .

git commit -m "Added content in GitNewBranch"

git checkout main

git diff main GitNewBranch

git merge GitNewBranch

git log --oneline --graph --decorate

git branch -d GitNewBranch

git status

git remote add origin https://github.com/Deepnarayan70/GitBranchDemo.git

git remote -v

git push -u origin main
```

---

## Project Structure

```
GitBranchDemo/
│
└── welcome.txt
```

---

## Branch Workflow

```text
main
 │
 ├── Initial Commit
 │
 └── GitNewBranch
      │
      ├── Modified welcome.txt
      │
      └── Commit Changes
             │
             ▼
      Merged into main
             │
             ▼
     GitNewBranch Deleted
```

---

## Result

- Successfully created a new Git branch.
- Switched between branches using Git.
- Modified and committed changes in the feature branch.
- Compared branch differences using `git diff`.
- Merged the feature branch into the `main` branch.
- Viewed the commit history using `git log`.
- Deleted the merged branch successfully.
- Connected the local repository to GitHub.
- Successfully pushed the repository to GitHub.

---

## Author

**Deep Narayan**

GitHub: https://github.com/Deepnarayan70
