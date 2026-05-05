//Testing IoT Device Security (default passwords, open ports)
open docker and then open cmd
type docker run -d -p 8090:3000 --name juiceshop bkimminich/juice-shop
in browser open http://localhost:8090
then type ipconfig->note wireless lan adapter ipv4 address
open kali linux->nmap localhost->nmap -sV ipv4 address
open juiceshop and login->right click->inspect->network
then do again any login-> you will get some responses then click on anything
===============================================================================================================================================

//DIGITAL FORENSICS USING AUTOPSY (STEP-BY-STEP)
STEP 1: Open Terminal

Press->Ctrl + Alt + T or open kali Linux terminal

STEP 2: Create Evidence File

echo "Cybersecurity Lab Evidence" > /home/kali/evidence.txt

Check->ls /home/kali

✔️ You should see `evidence.txt`

STEP 3: Create Disk File

dd if=/dev/zero of=/home/kali/practice_disk.dd bs=1M count=100
✔️ Creates 100MB disk

STEP 4: Format Disk

mkfs.ext4 /home/kali/practice_disk.dd

STEP 5: Create Mount Folder

mkdir /home/kali/mountdir

STEP 6: Mount Disk

sudo mount -o loop /home/kali/practice_disk.dd /home/kali/mountdir

STEP 7: Copy Evidence INTO Disk

sudo cp /home/kali/evidence.txt /home/kali/mountdir/

Check->ls /home/kali/mountdir

Must show->evidence.txt

STEP 8: Unmount Disk

sudo umount /home/kali/mountdir

 STEP 9: Install dc3dd (if not installed)

sudo apt update
sudo apt install dc3dd -y

STEP 10: Create Disk Image

sudo dc3dd if=/home/kali/practice_disk.dd of=/home/kali/disk_image.dd hash=md5 log=/home/kali/acquisition.log


STEP 11: Verify Image

ls -lh /home/kali/disk_image.dd or ls disk_image.dd
cat /home/kali/acquisition.log


STEP 12: Install Autopsy (if needed)
sudo apt install autopsy -y

STEP 13: Start Autopsy

sudo autopsy
Copy URL:

http://localhost:9999/autopsy or right click and open in tab 


STEP 14: Open Browser

Open Firefox:

bash
firefox

Paste URL in address bar.

STEP 15: Create Case

* Click **Create New Case**
* Case Name: `KaliLab`
* Description: anything
* Investigator: your name
  Click **Next → Finish**

STEP 16: Add Host

Host Name: `KaliLabMachine`
  Click **Next**

STEP 17: Add Image

Enter:
/home/kali/disk_image.dd
Select:

* Disk ✔️
* Symlink ✔️
Click **Next → Finish**

STEP 18: Analyze
Select disk
* Click **ANALYZE**
* Click **Next → Next → Finish**

STEP 19: File Analysis

Click->FILE ANALYSIS->Browse and find->evidence.txt
Open it → you will see->Cybersecurity Lab Evidence

STEP 20: Keyword Search
Click->KEYWORD SEARCH

Search:
Cybersecurity
Click **Search**
✔️ Click **link to results**
 STEP 21: Verify Result
✔️ You will see:

* File name
* Content
* Match
==========================================================================================================================================
//network foresics
Step 1: Open Wireshark

Open terminal:

wireshark &
Step 2: Select Network Interface

  * **wlan0** (WiFi) OR
  * **eth0** (Ethernet)
* Click **Start (shark icon)**

✔️ Packet capturing begins

Step 3: Generate Traffic

Open a new terminal:

ping google.com

OR open browser → any website

✔️ Packets will start appearing

Step 4: Protocol Analysis

Apply filters:

tcp

udp

http

Step 5: Apply IP Address Filter

Use your IP:

ip.addr == 192.168.1.97

Step 6: Source / Destination Filters

* Source:

ip.src == 192.168.1.97


* Destination:

ip.dst == 192.168.1.97
Step 7: Follow TCP Stream
Steps:

1. Select any TCP packet
2. Right click → **Follow → TCP Stream**
Step 8: Identify Suspicious Traffic

Open new terminal:

nmap -sS 192.168.0.156//your ip

Apply filter in Wireshark:

tcp.flags.syn == 1 && tcp.flags.ack == 0
 Step 9: Capture File Properties

Go to:Statistics → Capture File Properties

Step 10: Resolved Addresses

Statistics → Resolved Addresses

✔️ Converts:

* IP → Domain name
* MAC → Device name
Step 11: Protocol Hierarchy
Statistics → Protocol Hierarchy

Step 12: Conversations
Statistics → Conversations

Step 13: Packet Length

Statistics → Packet Length
 Step 14: Endpoints

Statistics → Endpoints

Step 15: I/O Graph

Go to:
Statistics → I/O Graph

⚙️ Setup

* Enable Graph 1
* Y-axis → Packets

Observation

* X-axis → Time
* Y-axis → Packets

✔️ Spikes → heavy traffic
✔️ Flat → low traffic
===============================================================================================================================
cd /var/log 
ls
last
journalctl | less
journalctl | grep ssh
journalctl | less    
journalctl | grep "Failed"lsls
journalctl | grep ssh     
journalctle | grep -i error
grep "404" /var/log/apache2/access.log
journalctl | grep -i error 
cd /var/log/apache2
ls
sudo less access.log       
grep "404" /var/log/apache2/access.log
less /var/log/dpkg.log

part a
sudo journalctl -f  
 sudo apt install openssh-server -y
sudo service ssh start
ip a
sudo service ssh start
└─$ journalctl | grep "Failed password"
└─$ journalctl | grep "Failed password" | awk '{print $13}' | sort | uniq -c | sort -nr

└─$ journalctl | grep "Failed password" | awk '{print $13}' | sort | uniq -c | sort -nr
if u wont get output type sudo service ssh start and then ssh fakeuser@localhost
->then again type journalctl big command

 part b
└─$ sudo apt update
└─$ sudo apt install util-linux -y
└─$ sudo lastb
=====================================================================
Title: Privacy Audit of Popular Apps (Desktop WhatsApp) and Websites (Facebook) & Data Breach Case Study Analysis
## ✅ Step 1: Open Kali Terminal

```bash
Ctrl + Alt + T
## ✅ Step 2: Install Node.js & npm
```bash
sudo apt update
sudo apt install nodejs npm -y

## ✅ Step 3: Install Nativefier
sudo npm install -g nativefier
nativefier https://web.whatsapp.com
web-whatsapp-linux-x64
## ✅ Step 5: Open WhatsApp Desktop
cd web-whatsapp-linux-x64
./WhatsAppWeb
## ✅ Step 6: Login
👉 QR code appears
👉 Open WhatsApp on phone → Linked Devices → Scan QR

✔️ Now WhatsApp works on Kali

# 🔍 Step 7: Start Wireshark

```bash
wireshark
## Select Interface
👉 Choose:eth0 OR wlan0
👉 Click **Start Capture**


## ✅ Step 8: Generate Traffic

In WhatsApp:

* Send messages
* Send images
* Open chats

---

## ✅ Step 9: Apply Filters

In Wireshark filter bar:
tls
or

dns
==================================================================

## System Security Audit

## 🔹 STEP 1: System Information
Windows + R → msinfo32
**Check:** -> OS Version -> System Type
**Observation:**
The system information was obtained using the msinfo32 tool. The system is running on Microsoft Windows 11 Home Single Language, 64-bit operating system, with Intel i5 processor and UEFI-based architecture. Secure Boot is enabled, indicating a secure boot configuration. Secure Boot enhances system security by preventing unauthorized boot loaders.

## 🔹 STEP 2: Check Windows Updates
Settings → Windows Update → Check for updates
**Observation:**
The Windows Update section was checked, and it was found that updates are available and pending installation. The system requires a restart to complete the update process. Pending updates may expose the system to known vulnerabilities. Regular updates are essential to maintain system security.

## 🔹 STEP 3: Check Firewall Status
Search → Windows Defender Firewall → Turn Windows Defender Firewall on or off
**Observation:**
The firewall settings were checked and it was observed that firewall management is handled by Kaspersky antivirus, indicating that a third-party firewall is active. This ensures network protection, although misconfiguration may still pose risks.

## 🔹 STEP 4: Check Antivirus Status
Windows Security → Virus & Threat Protection
**Check:**->* Real-time protection → ON and Last scan → Recent

**Observation:**
The antivirus status was verified and Kaspersky antivirus is active. No threats were detected and protection settings are functioning properly. Antivirus software provides protection against malware and cyber threats.

## 🔹 STEP 5: Check Password & Account Security
Settings → Accounts → Sign-in options
**Check:** Password / PIN enabled and  Windows Hello (optional)

**Observation:**
The system uses secure authentication methods such as password and PIN. This ensures secure access and prevents unauthorized login.

## 🔹 STEP 6: Check Installed Applications
Settings → Apps → Installed apps
**Check:**
* Unknown software and Cracked tools
**Observation:**
The installed applications were reviewed and no suspicious or unauthorized software was found. Avoiding unverified software helps prevent malware risks.

## 🔹 STEP 7: Check Startup Programs
**Steps:**
Ctrl + Shift + Esc → Startup tab
* Disable unknown apps

**Observation:**
Startup applications were analyzed and some unnecessary apps were enabled. Disabling them improves system performance and reduces security risks.
## 🔹 STEP 8: Check Network Security

**Steps:**
Settings → Network & Internet
check
* Wi-Fi connection
* Network type (Private/Public)

**Observation:**
The system is connected to Wi-Fi and configured as a Public network. This restricts device visibility and enhances security in untrusted environments.

## 🔹 STEP 9: Check Browser Security
Browser → Settings → Privacy & Security

**Check:**Safe browsing → ON and Remove unknown extensions

**Observation:**
Safe browsing is enabled, protecting against malicious websites and unsafe downloads. This helps prevent phishing and malware attacks.
## 🔹 STEP 10: Check Data Backup

**Steps:**
Search → Backup settings
**Check:**

* OneDrive / External backup

**Observation:**
Backup settings were checked and it was observed that backup is not configured. Lack of backup may lead to data loss in case of system failure or cyber attacks such as ransomware.
