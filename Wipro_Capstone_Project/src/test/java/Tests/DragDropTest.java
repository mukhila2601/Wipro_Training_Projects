package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.DragDropPage;

public class DragDropTest extends BaseTest {

    @Test
    public void testDragAndDrop() {

        DragDropPage dragDropPage =
                new DragDropPage(driver);

        dragDropPage.performDragAndDrop();

        Assert.assertTrue(
                dragDropPage.isDroppedSuccessfully(),
                "Drag and Drop failed!"
        );

        System.out.println("Drag and Drop Test Passed");
        System.out.println("Drop Result: "
                + dragDropPage.getDropMessage());
    }
}