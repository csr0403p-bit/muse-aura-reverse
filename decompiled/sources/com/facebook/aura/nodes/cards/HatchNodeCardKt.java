package com.facebook.aura.nodes.cards;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1DM;
import X.C3cG;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class HatchNodeCardKt {

    /* renamed from: com.facebook.aura.nodes.cards.HatchNodeCardKt$HatchNodeCard$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HatchNodeCardData $card;
        public final /* synthetic */ boolean $inBubble;
        public final /* synthetic */ boolean $isFreshlyArrived;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchScreen $screen;
        public final /* synthetic */ Map<String, String> $threadLogMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchNodeCardData hatchNodeCardData, HatchScreen hatchScreen, Map<String, String> map, BRg bRg, boolean z, boolean z2) {
            super(2);
            this.$card = hatchNodeCardData;
            this.$screen = hatchScreen;
            this.$threadLogMetadata = map;
            this.$modifier = bRg;
            this.$inBubble = z;
            this.$isFreshlyArrived = z2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                HatchNodeCardData hatchNodeCardData = this.$card;
                if (hatchNodeCardData instanceof CallingCardData) {
                    bfm.AgE(500072318);
                    HatchCallingCardKt.HatchCallingCard((CallingCardData) this.$card, this.$screen, this.$threadLogMetadata, this.$modifier, this.$inBubble, bfm, CallingCardData.$stable, 0);
                } else if (hatchNodeCardData instanceof MessagingCardData) {
                    bfm.AgE(-1092239291);
                    HatchMessagingCardKt.HatchMessagingCard((MessagingCardData) this.$card, this.$modifier, this.$isFreshlyArrived, this.$inBubble, bfm, MessagingCardData.$stable, 0);
                } else if (hatchNodeCardData instanceof PermissionCardData) {
                    bfm.AgE(-1092232324);
                    HatchPermissionCardKt.HatchPermissionCard((PermissionCardData) this.$card, this.$modifier, this.$inBubble, bfm, PermissionCardData.$stable, 0);
                } else if (hatchNodeCardData instanceof ClockCardData) {
                    bfm.AgE(-1092229097);
                    HatchClockCardKt.HatchClockCard((ClockCardData) this.$card, this.$modifier, this.$inBubble, bfm, ClockCardData.$stable, 0);
                } else if (hatchNodeCardData instanceof CalendarCardData) {
                    bfm.AgE(-1092225606);
                    HatchCalendarCardKt.HatchCalendarCard((CalendarCardData) this.$card, this.$modifier, this.$inBubble, bfm, CalendarCardData.$stable, 0);
                } else if (hatchNodeCardData instanceof ReminderCardData) {
                    bfm.AgE(-1092222022);
                    HatchReminderCardKt.HatchReminderCard((ReminderCardData) this.$card, this.$modifier, this.$inBubble, bfm, ReminderCardData.$stable, 0);
                } else if (hatchNodeCardData instanceof ContactsCardData) {
                    bfm.AgE(-1092218438);
                    HatchContactsCardKt.HatchContactsCard((ContactsCardData) this.$card, this.$modifier, this.$inBubble, bfm, ContactsCardData.$stable, 0);
                } else if (hatchNodeCardData instanceof GeofenceCardData) {
                    bfm.AgE(-1092214854);
                    HatchGeofenceCardKt.HatchGeofenceCard((GeofenceCardData) this.$card, this.$modifier, this.$inBubble, bfm, GeofenceCardData.$stable, 0);
                } else if (hatchNodeCardData instanceof NotificationOptInCardData) {
                    bfm.AgE(-1092210973);
                    HatchNotificationOptInCardKt.HatchNotificationOptInCard((NotificationOptInCardData) this.$card, this.$modifier, this.$inBubble, bfm, NotificationOptInCardData.$stable, 0);
                } else if (hatchNodeCardData instanceof RunInBackgroundCardData) {
                    bfm.AgE(-1092206879);
                    HatchRunInBackgroundCardKt.HatchRunInBackgroundCard((RunInBackgroundCardData) this.$card, this.$modifier, this.$inBubble, bfm, RunInBackgroundCardData.$stable, 0);
                } else {
                    AnonymousClass004.A1A(bfm, -1092247762);
                    throw C3cG.A0q();
                }
                AnonymousClass002.A19(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.nodes.cards.HatchNodeCardKt$HatchNodeCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchNodeCardData $card;
        public final /* synthetic */ C1DM $containerShape;
        public final /* synthetic */ boolean $inBubble;
        public final /* synthetic */ boolean $isFreshlyArrived;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchScreen $screen;
        public final /* synthetic */ Map<String, String> $threadLogMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchNodeCardData hatchNodeCardData, HatchScreen hatchScreen, Map<String, String> map, BRg bRg, boolean z, boolean z2, C1DM c1dm, int i, int i2) {
            super(2);
            this.$card = hatchNodeCardData;
            this.$screen = hatchScreen;
            this.$threadLogMetadata = map;
            this.$modifier = bRg;
            this.$isFreshlyArrived = z;
            this.$inBubble = z2;
            this.$containerShape = c1dm;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchNodeCardKt.HatchNodeCard(this.$card, this.$screen, this.$threadLogMetadata, this.$modifier, this.$isFreshlyArrived, this.$inBubble, this.$containerShape, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchNodeCard(HatchNodeCardData hatchNodeCardData, HatchScreen hatchScreen, Map<String, String> map, BRg bRg, boolean z, boolean z2, C1DM c1dm, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean z3 = z;
        boolean z4 = z2;
        C1DM c1dm2 = c1dm;
        AnonymousClass005.A0x(hatchNodeCardData, hatchScreen, map);
        bfm.AgG(210127026);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchNodeCardData, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass005.A09(bfm, hatchScreen);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass003.A05(AnonymousClass004.A1Z(map, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0r(bfm, z3);
        }
        int i5 = i2 & 32;
        int iA0s = 196608;
        if (i5 != 0) {
            iA05 |= iA0s;
        } else if ((196608 & i) == 0) {
            iA0s = AnonymousClass004.A0s(bfm, z4);
            iA05 |= iA0s;
        }
        int i6 = i2 & 64;
        int iA0j = 1572864;
        if (i6 != 0) {
            iA05 |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, c1dm2);
            iA05 |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z3 = false;
            }
            if (i5 != 0) {
                z4 = false;
            }
            if (i6 != 0) {
                c1dm2 = null;
            }
            AnonymousClass003.A0m(bfm, NodeCardComponentsKt.LocalNodeCardShape.A04(z4 ? null : c1dm2), new AnonymousClass1(hatchNodeCardData, hatchScreen, map, bRg2, z4, z3), 284896626);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(hatchNodeCardData, hatchScreen, map, bRg2, z3, z4, c1dm2, i, i2);
        }
    }
}
