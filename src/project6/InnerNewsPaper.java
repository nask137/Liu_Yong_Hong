package project6;

class InnerNewsPaper {
    String [] content;
    String paperName = "校新闻周报";

    public InnerNewsPaper() {
    }

    public InnerNewsPaper(String[] content, String paperName) {
        this.content = content;
        this.paperName = paperName;
    }

    public void showContent(String Schoolname){
        System.out.print(Schoolname+paperName+'\n'+Schoolname);
        for (String s : content) {
            System.out.println(s);
        }
    }

    /**
     * 获取
     * @return content
     */
    public String[] getContent() {
        return content;
    }

    /**
     * 获取
     * @return paperName
     */
    public String getPaperName() {
        return paperName;
    }

    /**
     * 设置
     * @param paperName
     */
    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public String toString() {
        return "InnerNewsPaper{content = " + content + ", paperName = " + paperName + "}";
    }

    /**
     * 设置
     * @param content
     */
    public void setContent(String[] content) {
        this.content = content;
    }
}
