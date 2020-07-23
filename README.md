# sikuli-pageobject-demo

Sikuli is a Java application that uses OpenCV and Java Robot to look for an image within a larger on-screen image and interact with it. This simplicity allows Sikuli to be used to automate almost anything - webpages, desktop applications, mobile phone apps, even games. As a result, however, one must create the structure to automate the application under test.

A typical Windows Desktop application has the following structure (see https://docs.microsoft.com/en-us/windows/win32/uxguide/visual-index):
1. a **Desktop** on which the user interface of an Application appears
1. one or more **Screens** which may extend the Desktop
1. the **Application** itself
1. at least one **Window** that contains the user interface
1. at least one **Form** that contains user interface Elements
1. at least one **Element** that the user interacts with

To make testing Windows desktop apps easier, this repository provides classes with a similar structure:
1. **SikuliDesktop**: a single Desktop on which the application appears
1. **Screen**: a pre-existing Sikuli class which simulates a computer monitor
1. **SikuliApp**: a class used to open and manage application connections and focus windows
1. **SikuliWindow**: one or more windows that can be used to restrict the image search area
1. **SikuliPage**: one or more pages displayed in a window that contain elements (similar to a traditional WebDriver PageObject)
1. **SikuliElement**: one or more elements that contain images used to drive UI interactions


