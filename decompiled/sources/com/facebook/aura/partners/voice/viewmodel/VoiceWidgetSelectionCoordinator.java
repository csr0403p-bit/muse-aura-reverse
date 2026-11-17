package com.facebook.aura.partners.voice.viewmodel;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.C06G;
import X.C06H;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.EnumC10460Hji;
import X.Ey9;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;
import com.facebook.aura.model.WidgetStateMutationHost;
import com.facebook.aura.model.WidgetStateSource;
import com.facebook.aura.partners.voice.api.VoiceSelectionIdentity;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import com.facebook.aura.uicontrol.UiControlActionSink;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class VoiceWidgetSelectionCoordinator implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final UiControlActionSink actionSink;
    public boolean cleared;
    public final Set<SelectionKey> confirmedSelections;
    public final Map<SelectionKey, HoC> pendingConfirmations;
    public PreparedSelection preparedSelection;
    public final Object selectionLock;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ConfirmationResult {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ ConfirmationResult[] $VALUES;
        public static final ConfirmationResult CONFIRMED;
        public static final ConfirmationResult DUPLICATE;
        public static final ConfirmationResult FAILED;
        public static final ConfirmationResult UNVERIFIED;

        static {
            ConfirmationResult confirmationResult = new ConfirmationResult("CONFIRMED", 0);
            CONFIRMED = confirmationResult;
            ConfirmationResult confirmationResult2 = new ConfirmationResult("DUPLICATE", 1);
            DUPLICATE = confirmationResult2;
            ConfirmationResult confirmationResult3 = new ConfirmationResult("UNVERIFIED", 2);
            UNVERIFIED = confirmationResult3;
            ConfirmationResult confirmationResult4 = new ConfirmationResult(CvmMigrationStatusJson.STAGE_FAILED, 3);
            FAILED = confirmationResult4;
            ConfirmationResult[] confirmationResultArr = {confirmationResult, confirmationResult2, confirmationResult3, confirmationResult4};
            $VALUES = confirmationResultArr;
            $ENTRIES = C3cG.A0w(confirmationResultArr);
        }

        public static Ey9<ConfirmationResult> getEntries() {
            return $ENTRIES;
        }

        public static ConfirmationResult valueOf(String str) {
            return (ConfirmationResult) Enum.valueOf(ConfirmationResult.class, str);
        }

        public static ConfirmationResult[] values() {
            return (ConfirmationResult[]) $VALUES.clone();
        }

        public ConfirmationResult(String str, int i) {
        }
    }

    public final class PreparedSelection {
        public final SelectionKey key;
        public final WidgetStateSource source;

        public final SelectionKey getKey() {
            return this.key;
        }

        public final WidgetStateSource getSource() {
            return this.source;
        }

        public PreparedSelection(SelectionKey selectionKey, WidgetStateSource widgetStateSource) {
            AnonymousClass003.A0u(selectionKey, widgetStateSource);
            this.key = selectionKey;
            this.source = widgetStateSource;
        }
    }

    public final class SelectionKey extends C06G {
        public final String hostMessageId;
        public final String widgetId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof SelectionKey) {
                    SelectionKey selectionKey = (SelectionKey) obj;
                    if (!C7384Etj.areEqual(this.hostMessageId, selectionKey.hostMessageId) || !C7384Etj.areEqual(this.widgetId, selectionKey.widgetId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ SelectionKey copy$default(SelectionKey selectionKey, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = selectionKey.hostMessageId;
            }
            if ((i & 2) != 0) {
                str2 = selectionKey.widgetId;
            }
            AnonymousClass003.A0u(str, str2);
            return new SelectionKey(str, str2);
        }

        public final String component1() {
            return this.hostMessageId;
        }

        public final String component2() {
            return this.widgetId;
        }

        public final String getHostMessageId() {
            return this.hostMessageId;
        }

        public final String getWidgetId() {
            return this.widgetId;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.widgetId, AnonymousClass001.A0G(this.hostMessageId));
        }

        public SelectionKey(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.hostMessageId = str;
            this.widgetId = str2;
        }

        public final SelectionKey copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new SelectionKey(str, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceWidgetSelectionCoordinator$confirm$2", f = "VoiceWidgetSelectionCoordinator.kt", l = {180, 183}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceWidgetSelectionCoordinator$confirm$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ConfirmationResult>, Object> {
        public final /* synthetic */ VoiceSelectionIdentity $browseAllSelection;
        public final /* synthetic */ WidgetStateMutationHost $host;
        public final /* synthetic */ SelectionKey $key;
        public final /* synthetic */ String $selectedText;
        public final /* synthetic */ String $voiceId;
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public final /* synthetic */ VoiceWidgetSelectionCoordinator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, VoiceWidgetSelectionCoordinator voiceWidgetSelectionCoordinator, WidgetStateMutationHost widgetStateMutationHost, SelectionKey selectionKey, String str2, VoiceSelectionIdentity voiceSelectionIdentity, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$voiceId = str;
            this.this$0 = voiceWidgetSelectionCoordinator;
            this.$host = widgetStateMutationHost;
            this.$key = selectionKey;
            this.$selectedText = str2;
            this.$browseAllSelection = voiceSelectionIdentity;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$voiceId, this.this$0, this.$host, this.$key, this.$selectedText, this.$browseAllSelection, htJ);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(17:0|2|144|(4:(1:(8:6|146|72|73|(7:75|(6:77|(0)|80|(1:(1:87))(1:84)|90|172)(1:85)|79|80|(4:82|(0)(0)|90|172)(0)|117|118)(1:88)|89|90|172)(2:7|8))(3:9|149|10)|100|101|197)(2:15|(2:17|18)(2:19|4b))|147|43|(3:45|46|b2)|61|(0)|69|(0)|73|(0)(0)|89|90|172|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x01d5, code lost:
        
            r2.pendingConfirmations.remove(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:127:0x01dc, code lost:
        
            if (r2.cleared == false) goto L128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:130:0x01e2, code lost:
        
            r2.confirmedSelections.add(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:131:0x01e9, code lost:
        
            if (r2.preparedSelection == r3) goto L132;
         */
        /* JADX WARN: Code restructure failed: missing block: B:132:0x01eb, code lost:
        
            r2.preparedSelection = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:134:0x01ee, code lost:
        
            throw r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:154:?, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
        
            if (r15 == null) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00cd, code lost:
        
            r7 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00d0, code lost:
        
            r2 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00d3, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:110:0x01af A[Catch: all -> 0x01ef, TryCatch #7 {, blocks: (B:110:0x01af, B:112:0x01b8, B:114:0x01bc, B:116:0x01c5, B:103:0x0198, B:105:0x01a1, B:107:0x01a5, B:126:0x01d5, B:128:0x01de, B:130:0x01e2, B:132:0x01eb, B:48:0x00b3, B:50:0x00bc, B:52:0x00c0, B:54:0x00c9), top: B:144:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:126:0x01d5 A[Catch: all -> 0x01ef, TRY_ENTER, TryCatch #7 {, blocks: (B:110:0x01af, B:112:0x01b8, B:114:0x01bc, B:116:0x01c5, B:103:0x0198, B:105:0x01a1, B:107:0x01a5, B:126:0x01d5, B:128:0x01de, B:130:0x01e2, B:132:0x01eb, B:48:0x00b3, B:50:0x00bc, B:52:0x00c0, B:54:0x00c9), top: B:144:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00f8 A[Catch: all -> 0x0178, Exception -> 0x017a, CancellationException -> 0x01c9, TryCatch #8 {CancellationException -> 0x01c9, Exception -> 0x017a, all -> 0x0178, blocks: (B:61:0x00d6, B:63:0x00f8, B:65:0x0103, B:66:0x0108, B:68:0x010c, B:69:0x0111, B:35:0x0079, B:38:0x0089, B:40:0x008d), top: B:151:0x0079 }] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0129 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0131 A[Catch: Exception -> 0x0174, CancellationException -> 0x0176, all -> 0x01cb, TryCatch #2 {all -> 0x01cb, blocks: (B:72:0x012a, B:73:0x012d, B:75:0x0131, B:77:0x0135, B:79:0x013c, B:80:0x0144, B:82:0x0148, B:84:0x0150, B:87:0x0159, B:89:0x016a, B:88:0x0163, B:100:0x017b, B:120:0x01ca), top: B:144:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0159 A[Catch: Exception -> 0x0174, CancellationException -> 0x0176, all -> 0x01cb, TryCatch #2 {all -> 0x01cb, blocks: (B:72:0x012a, B:73:0x012d, B:75:0x0131, B:77:0x0135, B:79:0x013c, B:80:0x0144, B:82:0x0148, B:84:0x0150, B:87:0x0159, B:89:0x016a, B:88:0x0163, B:100:0x017b, B:120:0x01ca), top: B:144:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0163 A[Catch: Exception -> 0x0174, CancellationException -> 0x0176, all -> 0x01cb, TryCatch #2 {all -> 0x01cb, blocks: (B:72:0x012a, B:73:0x012d, B:75:0x0131, B:77:0x0135, B:79:0x013c, B:80:0x0144, B:82:0x0148, B:84:0x0150, B:87:0x0159, B:89:0x016a, B:88:0x0163, B:100:0x017b, B:120:0x01ca), top: B:144:0x000a }] */
        /* JADX WARN: Type inference failed for: r3v17 */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 505
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceWidgetSelectionCoordinator.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ConfirmationResult> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceWidgetSelectionCoordinator", f = "VoiceWidgetSelectionCoordinator.kt", l = {138}, m = "confirmSelection", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceWidgetSelectionCoordinator$confirmSelection$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceWidgetSelectionCoordinator.this.confirmSelection(null, null, null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceWidgetSelectionCoordinator$sendVoiceChoice$1", f = "VoiceWidgetSelectionCoordinator.kt", l = {114}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceWidgetSelectionCoordinator$sendVoiceChoice$1, reason: invalid class name and case insensitive filesystem */
    public final class C133781 extends AbstractC07127nr implements G0V<WidgetStateMutationHost, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ VoiceSelectionIdentity $browseAllSelection;
        public final /* synthetic */ String $selectedText;
        public final /* synthetic */ String $sourceHostMessageId;
        public final /* synthetic */ String $sourceWidgetId;
        public final /* synthetic */ String $voiceId;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ VoiceWidgetSelectionCoordinator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133781(String str, String str2, VoiceWidgetSelectionCoordinator voiceWidgetSelectionCoordinator, String str3, String str4, VoiceSelectionIdentity voiceSelectionIdentity, HtJ<? super C133781> htJ) {
            super(2, htJ);
            this.$sourceHostMessageId = str;
            this.$sourceWidgetId = str2;
            this.this$0 = voiceWidgetSelectionCoordinator;
            this.$voiceId = str3;
            this.$selectedText = str4;
            this.$browseAllSelection = voiceSelectionIdentity;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C133781 c133781 = new C133781(this.$sourceHostMessageId, this.$sourceWidgetId, this.this$0, this.$voiceId, this.$selectedText, this.$browseAllSelection, htJ);
            c133781.L$0 = obj;
            return c133781;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String str;
            WidgetStateMutationHost widgetStateMutationHost = (WidgetStateMutationHost) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            boolean zA1X = true;
            if (i == 0) {
                Hwg.A00(obj);
                String str2 = this.$sourceHostMessageId;
                if (str2 != null && !C7BY.A0j(str2) && (str = this.$sourceWidgetId) != null && !C7BY.A0j(str)) {
                    VoiceWidgetSelectionCoordinator voiceWidgetSelectionCoordinator = this.this$0;
                    String str3 = this.$sourceHostMessageId;
                    String str4 = this.$sourceWidgetId;
                    String str5 = this.$voiceId;
                    String str6 = this.$selectedText;
                    VoiceSelectionIdentity voiceSelectionIdentity = this.$browseAllSelection;
                    this.L$0 = null;
                    this.label = 1;
                    obj = voiceWidgetSelectionCoordinator.confirmSelection(widgetStateMutationHost, str3, str4, str5, str6, voiceSelectionIdentity, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                return Boolean.valueOf(zA1X);
            }
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            zA1X = AnonymousClass001.A1X(obj);
            return Boolean.valueOf(zA1X);
        }

        @Override // X.G0V
        public final Object invoke(WidgetStateMutationHost widgetStateMutationHost, HtJ<? super Boolean> htJ) {
            return ((C133781) create(widgetStateMutationHost, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final boolean prepare(WidgetStateMutationHost widgetStateMutationHost, String str, String str2) {
        boolean zA1Z = AnonymousClass005.A1Z(widgetStateMutationHost, str, str2);
        boolean z = true;
        if (!VoiceGating.INSTANCE.isWidgetConfirmationEnabled()) {
            return zA1Z;
        }
        WidgetStateSource widgetStateSourceCaptureWidgetState = widgetStateMutationHost.captureWidgetState(str, str2);
        if (widgetStateSourceCaptureWidgetState == null) {
            return false;
        }
        SelectionKey selectionKey = new SelectionKey(str, str2);
        synchronized (this.selectionLock) {
            if (this.cleared || this.pendingConfirmations.containsKey(selectionKey) || this.confirmedSelections.contains(selectionKey)) {
                z = false;
            } else {
                this.preparedSelection = new PreparedSelection(selectionKey, widgetStateSourceCaptureWidgetState);
            }
        }
        return z;
    }

    public final void sendVoiceChoice(String str, String str2, String str3, VoiceSelectionIdentity voiceSelectionIdentity, String str4, String str5, String str6, String str7) {
        boolean zA1Z = AnonymousClass005.A1Z(str, str2, str3);
        C7384Etj.A0Y(str4, 4);
        this.actionSink.publishWidgetMessage(str, str4, str5, zA1Z, new C133781(str6, str7, this, str2, str3, voiceSelectionIdentity, null));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConfirmationResult.values().length];
            try {
                AnonymousClass002.A13(ConfirmationResult.CONFIRMED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConfirmationResult.DUPLICATE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ConfirmationResult.UNVERIFIED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ConfirmationResult.FAILED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ Object confirmSelection$default(VoiceWidgetSelectionCoordinator voiceWidgetSelectionCoordinator, WidgetStateMutationHost widgetStateMutationHost, String str, String str2, String str3, String str4, VoiceSelectionIdentity voiceSelectionIdentity, HtJ htJ, int i, Object obj) {
        if ((i & 32) != 0) {
            voiceSelectionIdentity = null;
        }
        return voiceWidgetSelectionCoordinator.confirmSelection(widgetStateMutationHost, str, str2, str3, str4, voiceSelectionIdentity, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logFailure(String str) {
        HatchAppEventLogger.INSTANCE.logEvent("voice_widget_confirmation", HatchSurface.VOICE_MODE.getValue(), null, "error", HatchComponent.VOICE_OPTIONS_WIDGET.getValue(), AnonymousClass007.A0c(HatchMetadataKey.FAILURE_REASON, str), null);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        List listA0X;
        synchronized (this.selectionLock) {
            this.cleared = true;
            this.preparedSelection = null;
            this.confirmedSelections.clear();
            listA0X = AbstractC0878AGe.A0X(this.pendingConfirmations.values());
            this.pendingConfirmations.clear();
        }
        Iterator it = listA0X.iterator();
        while (it.hasNext()) {
            ((HoC) it.next()).A5w(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object confirmSelection(com.facebook.aura.model.WidgetStateMutationHost r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, com.facebook.aura.partners.voice.api.VoiceSelectionIdentity r17, X.HtJ<? super java.lang.Boolean> r18) {
        /*
            r11 = this;
            r3 = r18
            boolean r0 = r3 instanceof com.facebook.aura.partners.voice.viewmodel.VoiceWidgetSelectionCoordinator.AnonymousClass1
            r5 = r11
            if (r0 == 0) goto L67
            r11 = r3
            com.facebook.aura.partners.voice.viewmodel.VoiceWidgetSelectionCoordinator$confirmSelection$1 r11 = (com.facebook.aura.partners.voice.viewmodel.VoiceWidgetSelectionCoordinator.AnonymousClass1) r11
            int r2 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L67
            int r2 = r2 - r1
            r11.label = r2
        L15:
            java.lang.Object r4 = r11.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r11.label
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L3b
            if (r0 != r3) goto L6d
            X.Hwg.A00(r4)
        L24:
            com.facebook.aura.partners.voice.viewmodel.VoiceWidgetSelectionCoordinator$ConfirmationResult r4 = (com.facebook.aura.partners.voice.viewmodel.VoiceWidgetSelectionCoordinator.ConfirmationResult) r4
            int r1 = r4.ordinal()
            if (r1 == r2) goto L7a
            r0 = 1
            r3 = 0
            if (r1 == r0) goto L7a
            r0 = 2
            if (r1 == r0) goto L72
            r0 = 3
            if (r1 == r0) goto L72
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L3b:
            X.Hwg.A00(r4)
            com.facebook.aura.partners.voice.gating.VoiceGating r0 = com.facebook.aura.partners.voice.gating.VoiceGating.INSTANCE
            boolean r0 = r0.isWidgetConfirmationEnabled()
            if (r0 == 0) goto L7a
            com.facebook.aura.partners.voice.viewmodel.VoiceWidgetSelectionCoordinator$SelectionKey r7 = new com.facebook.aura.partners.voice.viewmodel.VoiceWidgetSelectionCoordinator$SelectionKey
            r7.<init>(r13, r14)
            r0 = 0
            r11.L$0 = r0
            r11.L$1 = r0
            r11.L$2 = r0
            r11.L$3 = r0
            r11.L$4 = r0
            r11.L$5 = r0
            r11.label = r3
            r6 = r12
            r8 = r15
            r9 = r16
            r10 = r17
            java.lang.Object r4 = r5.confirm(r6, r7, r8, r9, r10, r11)
            if (r4 != r1) goto L24
            return r1
        L67:
            com.facebook.aura.partners.voice.viewmodel.VoiceWidgetSelectionCoordinator$confirmSelection$1 r11 = new com.facebook.aura.partners.voice.viewmodel.VoiceWidgetSelectionCoordinator$confirmSelection$1
            r11.<init>(r3)
            goto L15
        L6d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L72:
            com.facebook.aura.toast.api.ToastApi r1 = com.facebook.aura.toast.api.ToastApi.INSTANCE
            r0 = 2131887741(0x7f12067d, float:1.9410098E38)
            r1.showToast(r0)
        L7a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceWidgetSelectionCoordinator.confirmSelection(com.facebook.aura.model.WidgetStateMutationHost, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.facebook.aura.partners.voice.api.VoiceSelectionIdentity, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final VoiceWidgetSelectionCoordinator getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (VoiceWidgetSelectionCoordinator) abstractC3358CGz.A03(VoiceWidgetSelectionCoordinator.class, new VoiceWidgetSelectionCoordinator$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public VoiceWidgetSelectionCoordinator(AbstractC3358CGz abstractC3358CGz) {
        this.actionSink = UiControlActionSink.Companion.getInstance(abstractC3358CGz);
        this.selectionLock = C3cG.A0T();
        this.pendingConfirmations = C3cG.A0j();
        this.confirmedSelections = C3cG.A0k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object confirm(WidgetStateMutationHost widgetStateMutationHost, SelectionKey selectionKey, String str, String str2, VoiceSelectionIdentity voiceSelectionIdentity, HtJ<? super ConfirmationResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(str, this, widgetStateMutationHost, selectionKey, str2, voiceSelectionIdentity, null));
    }

    public /* synthetic */ VoiceWidgetSelectionCoordinator(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
