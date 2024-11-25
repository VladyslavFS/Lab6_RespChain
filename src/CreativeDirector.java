class CreativeDirector extends DesignApprover {
    @Override
    public void approveDesign(String design) {
        if (design.contains("final approval")) {
            System.out.println("Creative Director: Final approval granted.");
        } else {
            System.out.println("Creative Director: Design rejected.");
        }
    }
}
