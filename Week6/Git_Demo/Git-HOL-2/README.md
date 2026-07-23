# Git Hands-on 3
## Objective
Learn Git branching and merging by creating a new branch, making changes, comparing branches, merging the branch into the main branch, and deleting the merged branch.

Steps Completed
Created a new local Git repository.
Created the initial file welcome.txt.
Committed the initial version to the main branch.
Created a new branch named GitNewBranch.
Switched to the new branch.
Modified welcome.txt.
Committed the changes in GitNewBranch.
Verified the repository status.
Switched back to the main branch.
Compared the differences between main and GitNewBranch.
Merged GitNewBranch into main.
Displayed the commit history using Git graph.
Deleted the merged branch.
Connected the local repository to GitHub.
Pushed the repository successfully.
Commands Used
git init

git status

echo "This is the Master Branch" > welcome.txt

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

git remote add origin https://github.com/Jeet-Lohar-29/GitBranchDemo.git

git remote -v

git push -u origin main
Files Created
GitBranchDemo/
│
├── welcome.txt
└── .git/
Branch Structure
main
   │
   └── GitNewBranch
            │
            └── Added new content
                   │
                   ▼
              Merged into main
Result
Successfully created a new branch.
Successfully switched between branches.
Successfully committed changes in the feature branch.
Successfully compared branch differences.
Successfully merged the feature branch into the main branch.
Successfully viewed the commit graph.
Successfully deleted the merged branch.
Successfully pushed the repository to GitHub.
