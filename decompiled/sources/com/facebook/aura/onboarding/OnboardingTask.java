package com.facebook.aura.onboarding;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;

/* loaded from: classes.dex */
public final class OnboardingTask extends C06G {
    public final String connectorId;
    public final String description;
    public final CardSource fromCard;
    public final String iconUri;
    public final String id;
    public final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public final class CardSource {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ CardSource[] $VALUES;
        public static final CardSource FACEBOOK;
        public static final CardSource INSTAGRAM;

        static {
            CardSource cardSource = new CardSource("FACEBOOK", 0);
            FACEBOOK = cardSource;
            CardSource cardSource2 = new CardSource("INSTAGRAM", 1);
            INSTAGRAM = cardSource2;
            CardSource[] cardSourceArr = {cardSource, cardSource2};
            $VALUES = cardSourceArr;
            $ENTRIES = C3cG.A0w(cardSourceArr);
        }

        public static Ey9<CardSource> getEntries() {
            return $ENTRIES;
        }

        public static CardSource valueOf(String str) {
            return (CardSource) Enum.valueOf(CardSource.class, str);
        }

        public static CardSource[] values() {
            return (CardSource[]) $VALUES.clone();
        }

        public CardSource(String str, int i) {
        }
    }

    public static /* synthetic */ OnboardingTask copy$default(OnboardingTask onboardingTask, String str, String str2, String str3, String str4, String str5, CardSource cardSource, int i, Object obj) {
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        CardSource cardSource2 = cardSource;
        if ((i & 1) != 0) {
            str6 = onboardingTask.id;
        }
        if ((i & 2) != 0) {
            str7 = onboardingTask.title;
        }
        if ((i & 4) != 0) {
            str8 = onboardingTask.description;
        }
        if ((i & 8) != 0) {
            str9 = onboardingTask.iconUri;
        }
        if ((i & 16) != 0) {
            str10 = onboardingTask.connectorId;
        }
        if ((i & 32) != 0) {
            cardSource2 = onboardingTask.fromCard;
        }
        AnonymousClass005.A0x(str6, str7, str8);
        return new OnboardingTask(str6, str7, str8, str9, str10, cardSource2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OnboardingTask) {
                OnboardingTask onboardingTask = (OnboardingTask) obj;
                if (!C7384Etj.areEqual(this.id, onboardingTask.id) || !C7384Etj.areEqual(this.title, onboardingTask.title) || !C7384Etj.areEqual(this.description, onboardingTask.description) || !C7384Etj.areEqual(this.iconUri, onboardingTask.iconUri) || !C7384Etj.areEqual(this.connectorId, onboardingTask.connectorId) || this.fromCard != onboardingTask.fromCard) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.iconUri;
    }

    public final String component5() {
        return this.connectorId;
    }

    public final CardSource component6() {
        return this.fromCard;
    }

    public final String getConnectorId() {
        return this.connectorId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final CardSource getFromCard() {
        return this.fromCard;
    }

    public final String getIconUri() {
        return this.iconUri;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.description, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.id))) + AnonymousClass006.A0G(this.iconUri)) * 31) + AnonymousClass006.A0G(this.connectorId)) * 31) + C06G.A04(this.fromCard);
    }

    public OnboardingTask(String str, String str2, String str3, String str4, String str5, CardSource cardSource) {
        AnonymousClass005.A0x(str, str2, str3);
        this.id = str;
        this.title = str2;
        this.description = str3;
        this.iconUri = str4;
        this.connectorId = str5;
        this.fromCard = cardSource;
    }

    public final OnboardingTask copy(String str, String str2, String str3, String str4, String str5, CardSource cardSource) {
        AnonymousClass005.A0x(str, str2, str3);
        return new OnboardingTask(str, str2, str3, str4, str5, cardSource);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ OnboardingTask(String str, String str2, String str3, String str4, String str5, CardSource cardSource, int i, C06H c06h) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : cardSource);
    }
}
