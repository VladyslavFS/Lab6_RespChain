abstract class DesignApprover {
    protected DesignApprover nextApprover;

    public void setNextApprover(DesignApprover nextApprover) {
        this.nextApprover = nextApprover;
    }

    public void approveDesign(String design) {
        if (nextApprover != null) {
            nextApprover.approveDesign(design);
        }
    }
}
