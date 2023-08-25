package net.migstmc.aoreventure.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

public class NewOresDetectorItem extends Item {

    public NewOresDetectorItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        return ActionResult.SUCCESS;
    }
}
