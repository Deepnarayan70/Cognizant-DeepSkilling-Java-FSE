# Week 7 – DevOps, Docker, Cloud & Generative AI Fundamentals

## Overview

Week 7 focuses on the technologies that support modern software development beyond writing code. The topics covered include DevOps, Docker, Cloud Computing, Kubernetes, and Generative AI. Together, these technologies help developers automate software delivery, deploy applications efficiently, manage cloud infrastructure, and build AI-assisted solutions.

---

# Folder Structure

```
Week-7-DevOps-Cloud-GenAI
│
└── README.md
```

---

# Topics Covered

- DevOps Fundamentals
- CI/CD Pipeline
- Docker Fundamentals
- Cloud Computing
- AWS Basics
- Kubernetes Basics
- Generative AI
- Prompt Engineering

---

# 1. DevOps Fundamentals

## What is DevOps?

DevOps is a software development approach that combines Development (Dev) and Operations (Ops). It encourages collaboration, automation, and continuous improvement throughout the software development lifecycle.

Instead of treating development and deployment as separate activities, DevOps integrates them into a single workflow to deliver software faster and more reliably.

### DevOps Lifecycle

```
Plan
 ↓
Develop
 ↓
Build
 ↓
Test
 ↓
Release
 ↓
Deploy
 ↓
Operate
 ↓
Monitor
```

### Benefits of DevOps

- Faster software delivery
- Better collaboration
- Automated testing and deployment
- Continuous feedback
- Improved software quality
- Reduced deployment failures
- Faster issue resolution

### Common DevOps Tools

| Category | Tools |
|----------|---------------------------|
| Version Control | Git, GitHub |
| Build | Maven, Gradle |
| CI/CD | Jenkins, GitHub Actions |
| Containers | Docker |
| Orchestration | Kubernetes |
| Infrastructure | Terraform, Ansible |
| Monitoring | Prometheus, Grafana |

---

# 2. CI/CD Overview

## Continuous Integration (CI)

Continuous Integration is the process of automatically building and testing code whenever changes are pushed to a repository. It helps identify bugs early and keeps the project stable.

## Continuous Delivery (CD)

Continuous Delivery ensures that every successful build is always ready for deployment after automated testing.

## Continuous Deployment

Continuous Deployment automatically deploys validated applications to production without manual intervention.

### CI/CD Pipeline

```
Developer
    │
    ▼
Git Repository
    │
    ▼
Build
    │
    ▼
Automated Testing
    │
    ▼
Docker Image
    │
    ▼
Deployment
    │
    ▼
Monitoring
```

---

# 3. Docker Fundamentals

## What is Docker?

Docker is an open-source containerization platform that packages an application together with its dependencies into lightweight containers. These containers can run consistently across development, testing, and production environments.

### Docker Components

- Docker Engine
- Docker Client
- Docker Image
- Docker Container
- Dockerfile
- Docker Hub

### Docker Workflow

```
Source Code
     │
     ▼
Dockerfile
     │
     ▼
Docker Image
     │
     ▼
Docker Container
     │
     ▼
Application Running
```

### Advantages of Docker

- Platform independent
- Lightweight
- Fast deployment
- Consistent environments
- Easy scalability
- Better resource utilization

### Common Docker Commands

```bash
docker --version
docker pull nginx
docker build -t myapp .
docker images
docker run myapp
docker ps
docker stop <container-id>
docker rm <container-id>
docker rmi <image-id>
```

### Docker Image vs Container

| Docker Image | Docker Container |
|--------------|------------------|
| Blueprint of an application | Running instance of an image |
| Read-only | Executable |
| Used to create containers | Runs the application |

---

# 4. Cloud Computing Fundamentals

## What is Cloud Computing?

Cloud Computing is the delivery of computing resources such as servers, storage, databases, networking, and software over the internet. It allows organizations to scale applications without managing physical hardware.

### Cloud Service Models

### IaaS (Infrastructure as a Service)

Provides virtual infrastructure.

Examples:

- AWS EC2
- Azure Virtual Machines

### PaaS (Platform as a Service)

Provides a platform for application development.

Examples:

- Google App Engine
- Azure App Service

### SaaS (Software as a Service)

Provides ready-to-use software over the internet.

Examples:

- Gmail
- Microsoft 365
- Google Drive

### Cloud Deployment Models

- Public Cloud
- Private Cloud
- Hybrid Cloud
- Multi Cloud

### Major Cloud Providers

- Amazon Web Services (AWS)
- Microsoft Azure
- Google Cloud Platform
- Oracle Cloud

### Benefits

- Scalability
- Cost Efficiency
- High Availability
- Security
- Backup & Recovery
- Global Access

---

# 5. AWS Basics

### EC2

Provides virtual machines to host applications.

### S3

Object storage service used for files, backups, and static websites.

### IAM

Identity and Access Management for controlling users, roles, and permissions.

### VPC

Creates a private virtual network inside AWS.

### Security Groups

Acts as a virtual firewall to control network access.

---

# 6. Kubernetes Basics

## What is Kubernetes?

Kubernetes is a container orchestration platform used to deploy, manage, and scale Docker containers automatically.

### Core Components

- Pod
- Node
- Cluster
- Deployment
- Service
- ReplicaSet

### Benefits

- Auto Scaling
- Self Healing
- Load Balancing
- Rolling Updates
- High Availability

---

# 7. Generative AI Fundamentals

## What is Generative AI?

Generative AI refers to Artificial Intelligence systems capable of generating text, images, code, audio, and other forms of content based on user prompts.

### Popular Models

- GPT
- Gemini
- Claude
- Llama

### Applications

- Code Generation
- Chatbots
- Documentation
- Content Creation
- Image Generation
- Data Analysis
- Software Development Assistance

### Prompt Engineering

Prompt Engineering is the practice of writing clear and effective prompts to improve AI-generated responses.

Common prompting techniques include:

- Zero-shot Prompting
- One-shot Prompting
- Few-shot Prompting
- Role Prompting
- Chain-of-Thought Prompting

### Challenges

- Hallucinations
- Bias
- Data Privacy
- Security Risks
- Ethical Concerns

---

# DevOps + Cloud + AI Workflow

```
Developer
     │
     ▼
Git Repository
     │
     ▼
CI/CD Pipeline
     │
     ▼
Docker Container
     │
     ▼
Cloud Deployment
     │
     ▼
Kubernetes
     │
     ▼
Monitoring
     │
     ▼
AI-Assisted Development
```

---

# Key Learning Outcomes

By completing Week 7, I gained an understanding of:

- DevOps principles and lifecycle
- CI/CD automation
- Docker architecture and containerization
- Cloud Computing fundamentals
- Basic AWS services
- Kubernetes concepts
- Generative AI and Prompt Engineering
- Modern software deployment workflows

---

# Technologies Studied

- Git & GitHub
- DevOps
- CI/CD
- Docker
- Kubernetes (Basics)
- Cloud Computing
- AWS Fundamentals
- Generative AI
- Prompt Engineering

---

# Conclusion

Week 7 provided a strong foundation in modern software engineering practices. Learning DevOps, Docker, Cloud Computing, Kubernetes, and Generative AI helped me understand how applications are built, deployed, monitored, and maintained in real-world environments. These technologies play an important role in creating scalable, reliable, and cloud-ready software solutions.