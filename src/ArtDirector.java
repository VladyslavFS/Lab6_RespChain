class ArtDirector extends DesignApprover {
    @Override
    public void approveDesign(String design) {
        if (design.contains("concept")) {
            System.out.println("Art Director: Approved the concept.");
            if (nextApprover != null) {
                nextApprover.approveDesign(design);
            }
        } else {
            System.out.println("Art Director: Design rejected.");
        }
    }
}
