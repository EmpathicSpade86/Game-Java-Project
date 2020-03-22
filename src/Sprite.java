
public class Sprite {
        private String name;
        private String path;
        private int frame;
        private String pathExtention;

        public Sprite() {
        }

        public String getPathExtention() {
                return pathExtention;
        }

        public void setPathExtention(String pathExtention) {
                this.pathExtention = pathExtention;
        }

        public Sprite(String name, String path, int frame) {
                this.name = name;
                this.path = path;
                this.frame = frame;
                this.pathExtention = pathExtention;
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

                this.pathExtention += "up/up ";
                this.frame = 1;
        }

        public void SpriteDown(){
                this.pathExtention += "down/down ";
                this.frame = 1;
        }

        public void SpriteLeft(){
                this.pathExtention += "left/left ";
                this.frame = 1;
        }

        public void SpriteRight(){
                this.pathExtention += "right/right ";
                this.frame = 1;
        }

        public void SpriteIdle(){
                pathExtention = "down/down ";
                this.path += pathExtention;
                this.frame = 1;
        }

        public void SpriteDead(){
                this.pathExtention += "dead ";
        }



}
