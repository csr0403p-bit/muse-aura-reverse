package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C06H;
import X.C3cG;
import X.C79;
import X.C9hr;
import X.C9iL;
import X.Ey9;
import X.F0C;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes3.dex */
public final class InternalSettingsPage {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ InternalSettingsPage[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final InternalSettingsPage ACCESS_LIBRARY;
    public static final InternalSettingsPage ACTIVATION;
    public static final InternalSettingsPage ATTRIBUTION;
    public static final InternalSettingsPage CONFIDENTIAL_VM;
    public static final InternalSettingsPage CREDITS;
    public static final Companion Companion;
    public static final InternalSettingsPage DEBUG;
    public static final InternalSettingsPage DESIGN;
    public static final InternalSettingsPage DEVICES;
    public static final InternalSettingsPage DISABLED;
    public static final InternalSettingsPage FEED;
    public static final InternalSettingsPage LOCK;
    public static final InternalSettingsPage LOGIN;
    public static final InternalSettingsPage MAIN;
    public static final InternalSettingsPage NODES;
    public static final InternalSettingsPage NUDGES;
    public static final InternalSettingsPage OHAI;
    public static final InternalSettingsPage ONBOARDING;
    public static final InternalSettingsPage SANDBOX;
    public static final InternalSettingsPage SUBSCRIPTION;
    public static final InternalSettingsPage UI_NAVIGATE;
    public static final InternalSettingsPage WEARABLES;

    public final class Companion {

        /* renamed from: com.facebook.aura.navigation.key.InternalSettingsPage$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.navigation.key.InternalSettingsPage", InternalSettingsPage.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(InternalSettingsPage.$cachedSerializer$delegate);
        }

        public final C9hr<InternalSettingsPage> serializer() {
            return AnonymousClass001.A12(InternalSettingsPage.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        InternalSettingsPage internalSettingsPage = new InternalSettingsPage("MAIN", 0);
        MAIN = internalSettingsPage;
        InternalSettingsPage internalSettingsPage2 = new InternalSettingsPage("SANDBOX", 1);
        SANDBOX = internalSettingsPage2;
        InternalSettingsPage internalSettingsPage3 = new InternalSettingsPage("DEBUG", 2);
        DEBUG = internalSettingsPage3;
        InternalSettingsPage internalSettingsPage4 = new InternalSettingsPage("DESIGN", 3);
        DESIGN = internalSettingsPage4;
        InternalSettingsPage internalSettingsPage5 = new InternalSettingsPage("LOGIN", 4);
        LOGIN = internalSettingsPage5;
        InternalSettingsPage internalSettingsPage6 = new InternalSettingsPage("CONFIDENTIAL_VM", 5);
        CONFIDENTIAL_VM = internalSettingsPage6;
        InternalSettingsPage internalSettingsPage7 = new InternalSettingsPage("ACTIVATION", 6);
        ACTIVATION = internalSettingsPage7;
        InternalSettingsPage internalSettingsPage8 = new InternalSettingsPage("ATTRIBUTION", 7);
        ATTRIBUTION = internalSettingsPage8;
        InternalSettingsPage internalSettingsPage9 = new InternalSettingsPage("DEVICES", 8);
        DEVICES = internalSettingsPage9;
        InternalSettingsPage internalSettingsPage10 = new InternalSettingsPage("DISABLED", 9);
        DISABLED = internalSettingsPage10;
        InternalSettingsPage internalSettingsPage11 = new InternalSettingsPage("LOCK", 10);
        LOCK = internalSettingsPage11;
        InternalSettingsPage internalSettingsPage12 = new InternalSettingsPage("NUDGES", 11);
        NUDGES = internalSettingsPage12;
        InternalSettingsPage internalSettingsPage13 = new InternalSettingsPage("NODES", 12);
        NODES = internalSettingsPage13;
        InternalSettingsPage internalSettingsPage14 = new InternalSettingsPage("ONBOARDING", 13);
        ONBOARDING = internalSettingsPage14;
        InternalSettingsPage internalSettingsPage15 = new InternalSettingsPage("SUBSCRIPTION", 14);
        SUBSCRIPTION = internalSettingsPage15;
        InternalSettingsPage internalSettingsPage16 = new InternalSettingsPage("CREDITS", 15);
        CREDITS = internalSettingsPage16;
        InternalSettingsPage internalSettingsPage17 = new InternalSettingsPage("FEED", 16);
        FEED = internalSettingsPage17;
        InternalSettingsPage internalSettingsPage18 = new InternalSettingsPage("WEARABLES", 17);
        WEARABLES = internalSettingsPage18;
        InternalSettingsPage internalSettingsPage19 = new InternalSettingsPage("OHAI", 18);
        OHAI = internalSettingsPage19;
        InternalSettingsPage internalSettingsPage20 = new InternalSettingsPage("UI_NAVIGATE", 19);
        UI_NAVIGATE = internalSettingsPage20;
        InternalSettingsPage internalSettingsPage21 = new InternalSettingsPage("ACCESS_LIBRARY", 20);
        ACCESS_LIBRARY = internalSettingsPage21;
        InternalSettingsPage[] internalSettingsPageArr = {internalSettingsPage, internalSettingsPage2, internalSettingsPage3, internalSettingsPage4, internalSettingsPage5, internalSettingsPage6, internalSettingsPage7, internalSettingsPage8, internalSettingsPage9, internalSettingsPage10, internalSettingsPage11, internalSettingsPage12, internalSettingsPage13, internalSettingsPage14, internalSettingsPage15, internalSettingsPage16, internalSettingsPage17, internalSettingsPage18, internalSettingsPage19, internalSettingsPage20, internalSettingsPage21};
        $VALUES = internalSettingsPageArr;
        $ENTRIES = C3cG.A0w(internalSettingsPageArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<InternalSettingsPage> getEntries() {
        return $ENTRIES;
    }

    public static InternalSettingsPage valueOf(String str) {
        return (InternalSettingsPage) Enum.valueOf(InternalSettingsPage.class, str);
    }

    public static InternalSettingsPage[] values() {
        return (InternalSettingsPage[]) $VALUES.clone();
    }

    public InternalSettingsPage(String str, int i) {
    }
}
