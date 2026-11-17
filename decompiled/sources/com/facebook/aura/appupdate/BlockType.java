package com.facebook.aura.appupdate;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BlockType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ BlockType[] $VALUES;
    public static final BlockType HARD;
    public static final BlockType NONE;
    public static final BlockType SOFT;

    static {
        BlockType blockType = new BlockType("HARD", 0);
        HARD = blockType;
        BlockType blockType2 = new BlockType("SOFT", 1);
        SOFT = blockType2;
        BlockType blockType3 = new BlockType(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 2);
        NONE = blockType3;
        BlockType[] blockTypeArr = {blockType, blockType2, blockType3};
        $VALUES = blockTypeArr;
        $ENTRIES = C3cG.A0w(blockTypeArr);
    }

    public static Ey9<BlockType> getEntries() {
        return $ENTRIES;
    }

    public static BlockType valueOf(String str) {
        return (BlockType) Enum.valueOf(BlockType.class, str);
    }

    public static BlockType[] values() {
        return (BlockType[]) $VALUES.clone();
    }

    public BlockType(String str, int i) {
    }
}
