import tkinter as tk
import time

class Stopwatch:
    def __init__(self, root):
        self.root = root
        self.root.title("Stopwatch")
        self.root.configure(bg="#2c3e50")
        
        self.elapsed_time = 0
        self.running = False
        self.start_time = 0

        # Display Label
        self.display = tk.Label(
            root, 
            text="00:00:00.000", 
            font=("Helvetica", 48), 
            bg="#34495e", 
            fg="#ecf0f1", 
            padx=20, 
            pady=20,
            borderwidth=2,
            relief="groove"
        )
        self.display.pack(pady=20)

        # Button Frame
        button_frame = tk.Frame(root, bg="#2c3e50")
        button_frame.pack(pady=10)

        # Start Button
        self.start_button = tk.Button(
            button_frame, 
            text="Start", 
            command=self.start, 
            font=("Helvetica", 16), 
            bg="#27ae60", 
            fg="white", 
            width=6,
            relief="flat"
        )
        self.start_button.pack(side=tk.LEFT, padx=10)

        # Stop Button
        self.stop_button = tk.Button(
            button_frame, 
            text="Stop", 
            command=self.stop, 
            font=("Helvetica", 16), 
            bg="#c0392b", 
            fg="white", 
            width=6,
            relief="flat"
        )
        self.stop_button.pack(side=tk.LEFT, padx=10)

        # Reset Button
        self.reset_button = tk.Button(
            button_frame, 
            text="Reset", 
            command=self.reset, 
            font=("Helvetica", 16), 
            bg="#2980b9", 
            fg="white", 
            width=6,
            relief="flat"
        )
        self.reset_button.pack(side=tk.LEFT, padx=10)

    def update_display(self):
        if self.running:
            self.elapsed_time = time.time() - self.start_time
            hours, remainder = divmod(self.elapsed_time, 3600)
            minutes, seconds = divmod(remainder, 60)
            milliseconds = int((self.elapsed_time - int(self.elapsed_time)) * 1000)
            self.display.config(text=f"{int(hours):02}:{int(minutes):02}:{int(seconds):02}.{milliseconds:03}")
            self.root.after(10, self.update_display)  # Update every 10 milliseconds

    def start(self):
        if not self.running:
            self.start_time = time.time() - self.elapsed_time
            self.running = True
            self.update_display()

    def stop(self):
        if self.running:
            self.running = False

    def reset(self):
        self.stop()
        self.elapsed_time = 0
        self.display.config(text="00:00:00.000")

if __name__ == "__main__":
    root = tk.Tk()
    stopwatch = Stopwatch(root)
    root.mainloop()
