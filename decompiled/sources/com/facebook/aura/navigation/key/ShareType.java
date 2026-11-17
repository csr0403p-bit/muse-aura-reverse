package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C06H;
import X.C79;
import X.C9hr;
import X.C9iL;
import X.Ey9;
import X.F0C;
import X.F3w;
import com.facebook.aura.identity.provider.HatchChatThemeHelperKt;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.aura.sharedcontent.SharedContentRepositoryKt;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes.dex */
public final class ShareType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ShareType[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final ShareType ARTIFACT;
    public static final ShareType AVATAR;
    public static final Companion Companion;
    public static final ShareType DEFAULT;
    public static final ShareType IDEA;
    public static final ShareType IMAGE;
    public static final ShareType INVITE;
    public static final ShareType MESSAGE;
    public static final ShareType MESSAGE_MEDIA;
    public static final ShareType SCREENSHOT;
    public static final ShareType SPACE;
    public static final ShareType VIDEO;
    public final String analyticsValue;

    public final class Companion {

        /* renamed from: com.facebook.aura.navigation.key.ShareType$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.navigation.key.ShareType", ShareType.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(ShareType.$cachedSerializer$delegate);
        }

        public final C9hr<ShareType> serializer() {
            return AnonymousClass001.A12(ShareType.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        ShareType shareType = new ShareType("DEFAULT", 0, null);
        DEFAULT = shareType;
        ShareType shareType2 = new ShareType("MESSAGE", 1, ReplyAttributionSerializer.TYPE_MESSAGE);
        MESSAGE = shareType2;
        ShareType shareType3 = new ShareType("MESSAGE_MEDIA", 2, "message_media");
        MESSAGE_MEDIA = shareType3;
        ShareType shareType4 = new ShareType("IDEA", 3, "idea");
        IDEA = shareType4;
        ShareType shareType5 = new ShareType("IMAGE", 4, "image");
        IMAGE = shareType5;
        ShareType shareType6 = new ShareType("VIDEO", 5, "video");
        VIDEO = shareType6;
        ShareType shareType7 = new ShareType("SCREENSHOT", 6, "screenshot");
        SCREENSHOT = shareType7;
        ShareType shareType8 = new ShareType("ARTIFACT", 7, SharedContentRepositoryKt.WIRE_TYPE_ARTIFACT);
        ARTIFACT = shareType8;
        ShareType shareType9 = new ShareType("SPACE", 8, "space");
        SPACE = shareType9;
        ShareType shareType10 = new ShareType("AVATAR", 9, HatchChatThemeHelperKt.HATCH_AVATAR_THEME_ID);
        AVATAR = shareType10;
        ShareType shareType11 = new ShareType("INVITE", 10, "invite");
        INVITE = shareType11;
        ShareType[] shareTypeArr = {shareType, shareType2, shareType3, shareType4, shareType5, shareType6, shareType7, shareType8, shareType9, shareType10, shareType11};
        $VALUES = shareTypeArr;
        $ENTRIES = new F3w(shareTypeArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<ShareType> getEntries() {
        return $ENTRIES;
    }

    public static ShareType valueOf(String str) {
        return (ShareType) Enum.valueOf(ShareType.class, str);
    }

    public static ShareType[] values() {
        return (ShareType[]) $VALUES.clone();
    }

    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }

    public ShareType(String str, int i, String str2) {
        this.analyticsValue = str2;
    }
}
