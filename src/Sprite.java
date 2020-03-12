
public class Sprite {
        private String name;
        private String path;
        private int frame;

        public Sprite() {
        }

        public Sprite(String name, String path, int frame) {
                this.name = name;
                this.path = path;
                this.frame = frame;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getPath() {
                return path;
        }

        public void setPath(String path) {
                this.path = path;
        }

        public int getFrame() {
                return frame;
        }

        public void setFrame(int frame) {
                this.frame = frame;
        }

        public void animate() {
                frame++;
                if (frame > 4) {
                        frame = 1;
                }
        }

        public void SpriteUp(){
                this.path += "up/up ";
                this.frame = 1;
        }

        public void SpriteDown(){
                this.path += "down/down ";
                this.frame = 1;
        }

        public void SpriteLeft(){
                this.path += "left/left ";
                this.frame = 1;
        }

        public void SpriteRight(){
                this.path += "right/right ";
                this.frame = 1;
        }

        public void SpriteIdle(){
                this.path += "down/down ";
                this.frame = 1;
        }

        public void SpriteDead(){
                this.path += "dead ";
        }



}
