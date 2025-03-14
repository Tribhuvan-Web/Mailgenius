# Mail Genius: Your AI Email Assistant

Mmail Genius is a smart AI-powered email assistant designed to generate professional and context-appropriate auto-replies for your emails. Powered by advanced language models, it helps save time and ensures effective communication by crafting tailored email responses.

## Features
- **Auto-Reply Generation**: Create professional replies for incoming emails automatically.
- **Customizable Tone**: Generate emails with different tones like formal, friendly, or casual based on your preferences.
- **Efficient Integration**: Easily integrate with existing services using APIs.
- **Error Handling**: Provides clear error messages in case of issues while processing requests.

---

## Project Structure
- **Controller**: 
  - Manages API endpoints for generating email responses.
  - Endpoints:
    - `POST /api/email/generate`: Accepts email content and generates a response.
- **Service**:
  - Contains the logic for building email prompts and processing responses.
  - Connects to the AI service to get generated email content.

---

## Usage

### Prerequisites
1. Java 17 or higher.
2. Dependency Management: Maven or Gradle.
3. API Key or URL for the external AI email-generation service.

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/your-repo/mmail-genius.git

### Rate limit
1. Added the functionality of 100request / min