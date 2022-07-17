# Android Study Guide Service
Ktor service to provide sample data for Android/Kotlin development workshops.

## Supported Endpoints
GET `/topics`

## Deployment

### Build the Docker container
>docker build -t us-west2-docker.pkg.dev/goobar-training/goobar-docker-containers/android-study-guide-service .

### Deploy from Docker to Artifact Registry

#### Authenticate Docker
Authenticate Docker to push to Artifact Registry
`gcloud auth configure-docker <gcloud region>-docker.pkg.dev`
For example:
> gcloud auth configure-docker us-west2-docker.pkg.dev 

#### Push to Artifact Registry
>docker push us-west2-docker.pkg.dev/goobar-training/goobar-docker-containers/android-study-guide-service

### Deploy to Cloud Run
> gcloud run deploy android-study-guide-service --image us-west2-docker.pkg.dev/goobar-training/goobar-docker-containers/android-study-guide-service