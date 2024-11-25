class GraphicDesigner extends DesignApprover {
    @Override
    public void approveDesign(String design) {
        if (design.contains("basic elements")) {
            System.out.println("Graphic Designer: Approved basic elements.");
            if (nextApprover != null) {
                nextApprover.approveDesign(design);
            }
        } else {
            System.out.println("Graphic Designer: Design rejected.");
        }
    }
}
