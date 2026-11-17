package X;

import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.maps.model.HatchMapSceneKt;
import java.io.Serializable;

/* renamed from: X.Goa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10055Goa implements Serializable {
    public static final long serialVersionUID = 1;
    public final String arrayEmptySeparator;
    public final char arrayValueSeparator;
    public final EnumC9660Gd0 arrayValueSpacing;
    public final String objectEmptySeparator;
    public final char objectEntrySeparator;
    public final EnumC9660Gd0 objectEntrySpacing;
    public final char objectFieldValueSeparator;
    public final EnumC9660Gd0 objectFieldValueSpacing;
    public final String rootSeparator;

    /* JADX WARN: Illegal instructions before constructor call */
    public C10055Goa() {
        EnumC9660Gd0 enumC9660Gd0 = EnumC9660Gd0.BOTH;
        EnumC9660Gd0 enumC9660Gd02 = EnumC9660Gd0.NONE;
        this(enumC9660Gd0, enumC9660Gd02, enumC9660Gd02, InviteCodeScratcherKt.CODE_SEPARATOR, InviteCodeScratcherKt.CODE_SEPARATOR, InviteCodeScratcherKt.CODE_SEPARATOR, HatchMapSceneKt.ARTIFACT_ID_SEPARATOR, ',', ',');
    }

    public C10055Goa(EnumC9660Gd0 enumC9660Gd0, EnumC9660Gd0 enumC9660Gd02, EnumC9660Gd0 enumC9660Gd03, String str, String str2, String str3, char c, char c2, char c3) {
        this.rootSeparator = str;
        this.objectFieldValueSeparator = c;
        this.objectFieldValueSpacing = enumC9660Gd0;
        this.objectEntrySeparator = c2;
        this.objectEntrySpacing = enumC9660Gd02;
        this.objectEmptySeparator = str2;
        this.arrayValueSeparator = c3;
        this.arrayValueSpacing = enumC9660Gd03;
        this.arrayEmptySeparator = str3;
    }
}
