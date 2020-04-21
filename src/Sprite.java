
public class Sprite {
        private String name;
        private String path;
        private int frame;
        private String pathExtention;

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


        public Sprite(String name, String path){
                this.name = name;
                this.path = path;
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
                this.frame = frame++;
        }

        public void SpriteDown(){
                this.pathExtention += "down/down ";
                this.frame = frame++;
        }

        public void SpriteLeft(){
                this.pathExtention += "left/left ";
                this.frame = frame++;
        }

        public void SpriteRight(){
                this.pathExtention += "right/right ";
                this.frame = frame++;
        }

        public void SpriteIdle(){
                pathExtention = "down/down ";
                this.path += pathExtention;
                this.frame = frame++;
        }

        public void SpriteDead(){
                this.pathExtention += "dead ";
        }



}
