package com.facebook.aura.model;

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
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes.dex */
public final class HatchAttachmentKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchAttachmentKind[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final HatchAttachmentKind AvatarDance;
    public static final Companion Companion;
    public final boolean sharesAsDance;
    public final boolean showsPageIndicator;
    public final boolean useShareAsPrimaryAction;

    public final class Companion {

        /* renamed from: com.facebook.aura.model.HatchAttachmentKind$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.model.HatchAttachmentKind", HatchAttachmentKind.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(HatchAttachmentKind.$cachedSerializer$delegate);
        }

        public final C9hr<HatchAttachmentKind> serializer() {
            return AnonymousClass001.A12(HatchAttachmentKind.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        HatchAttachmentKind hatchAttachmentKind = new HatchAttachmentKind("AvatarDance", 0, true, true, true);
        AvatarDance = hatchAttachmentKind;
        HatchAttachmentKind[] hatchAttachmentKindArr = {hatchAttachmentKind};
        $VALUES = hatchAttachmentKindArr;
        $ENTRIES = new F3w(hatchAttachmentKindArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<HatchAttachmentKind> getEntries() {
        return $ENTRIES;
    }

    public static HatchAttachmentKind valueOf(String str) {
        return (HatchAttachmentKind) Enum.valueOf(HatchAttachmentKind.class, str);
    }

    public static HatchAttachmentKind[] values() {
        return (HatchAttachmentKind[]) $VALUES.clone();
    }

    public final boolean getSharesAsDance() {
        return this.sharesAsDance;
    }

    public final boolean getShowsPageIndicator() {
        return this.showsPageIndicator;
    }

    public final boolean getUseShareAsPrimaryAction() {
        return this.useShareAsPrimaryAction;
    }

    public HatchAttachmentKind(String str, int i, boolean z, boolean z2, boolean z3) {
        this.showsPageIndicator = z;
        this.useShareAsPrimaryAction = z2;
        this.sharesAsDance = z3;
    }
}
