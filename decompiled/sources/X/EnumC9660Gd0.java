package X;

import com.facebook.aura.activation.view.InviteCodeScratcherKt;

/* renamed from: X.Gd0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC9660Gd0 {
    NONE("", ""),
    /* JADX INFO: Fake field, exist only in values array */
    BEFORE(InviteCodeScratcherKt.CODE_SEPARATOR, ""),
    /* JADX INFO: Fake field, exist only in values array */
    AFTER("", InviteCodeScratcherKt.CODE_SEPARATOR),
    BOTH(InviteCodeScratcherKt.CODE_SEPARATOR, InviteCodeScratcherKt.CODE_SEPARATOR);

    public final String spacesAfter;
    public final String spacesBefore;

    EnumC9660Gd0(String str, String str2) {
        this.spacesBefore = str;
        this.spacesAfter = str2;
    }
}
