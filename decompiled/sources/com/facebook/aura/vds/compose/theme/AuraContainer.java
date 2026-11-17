package com.facebook.aura.vds.compose.theme;

/* loaded from: classes.dex */
public interface AuraContainer {

    public interface AuraBottomSheet extends AuraContainer {
    }

    public interface AuraScreen extends AuraContainer {
    }

    public final class Card implements AuraContainer {
        public static final int $stable = 0;
        public static final Card INSTANCE = new Card();
    }

    public final class PrimaryBottomSheet implements AuraBottomSheet {
        public static final int $stable = 0;
        public static final PrimaryBottomSheet INSTANCE = new PrimaryBottomSheet();
    }

    public final class PrimaryScreen implements AuraScreen {
        public static final int $stable = 0;
        public static final PrimaryScreen INSTANCE = new PrimaryScreen();
    }

    public final class SecondaryBottomSheet implements AuraBottomSheet {
        public static final int $stable = 0;
        public static final SecondaryBottomSheet INSTANCE = new SecondaryBottomSheet();
    }

    public final class SecondaryScreen implements AuraScreen {
        public static final int $stable = 0;
        public static final SecondaryScreen INSTANCE = new SecondaryScreen();
    }
}
