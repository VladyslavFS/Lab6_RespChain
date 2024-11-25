public class DesignSubmission {
    public static void main(String[] args) {
        // Create approvers
        GraphicDesigner graphicDesigner = new GraphicDesigner();
        ArtDirector artDirector = new ArtDirector();
        CreativeDirector creativeDirector = new CreativeDirector();

        // Set up chain of responsibility
        graphicDesigner.setNextApprover(artDirector);
        artDirector.setNextApprover(creativeDirector);

        // Submit a design
        String design = "basic elements, concept, final approval";
        System.out.println("Submitting design for approval...");
        graphicDesigner.approveDesign(design);
    }
}
