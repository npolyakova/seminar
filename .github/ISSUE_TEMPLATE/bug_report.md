name: "🐞 Bug in production"
description: "Bug in production environment"
title: "[What] doesn't work? [Where] does it not work? [Under] what conditions?"
labels:
  - "bug:production"
assignees: []
body:
  - type: textarea
    id: current_behaviour
    attributes:
      label: "Current Behavior"
      description: "Provide a description of the actual behavior with supporting screenshots or videos"
    validations:
      required: true
  - type: textarea
    id: expected_behaviour
    attributes:
      label: "Expected Behavior"
      description: "Describe the desired behavior"
    validations:
      required: true
  - type: textarea
    id: steps_to_reproducing
    attributes:
      label: "Steps to reproduce"
      description: "Detail the steps that would replicate this issue"
      placeholder: |
        1. Go to '...'
        2. Click on '....'
        3. Scroll down to '....'
    validations:
      required: true
  - type: textarea
    id: additional_information
    attributes:
      label: "Additional Information"
      description: "Add any context about the problem here: device, OS, browser and so on"
    validations:
      required: false
  - type: input
    id: prevalence
    attributes:
      label: Browser
      description: "How often do you or others encounter this bug?"
      placeholder: "Whenever I visit the user account page (1-2 times a week)"
    validations:
      required: false  
  - type: textarea
    id: related_feature_requests
    attributes:
      label: "Related feature requests"
      description: "Specify links to related user requests"
      placeholder: |
        - [ ] [name of feature request_1](url)
        - [ ] [name of feature request_2](url)
    validations:
      required: false
