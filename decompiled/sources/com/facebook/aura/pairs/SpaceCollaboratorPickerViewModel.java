package com.facebook.aura.pairs;

import X.A3q;
import X.AEs;
import X.AEu;
import X.AGI;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC10623Hzj;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.BLL;
import X.C0881AGi;
import X.C1BN;
import X.C20Q;
import X.C3UX;
import X.C3cG;
import X.C4JM;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C7Bq;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.GCV;
import X.HoC;
import X.HtJ;
import X.Hu1;
import X.Hwg;
import X.HxE;
import X.HzP;
import X.HzR;
import com.facebook.aura.R;
import com.facebook.aura.accountcenter.MC;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.common.video.HatchTransportHttpDataSourceKt;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderStateMachine;
import com.facebook.aura.pairs.SpacePickerEffect;
import com.facebook.aura.settings.MC;
import com.facebook.aura.toast.api.ToastApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class SpaceCollaboratorPickerViewModel extends AEs {
    public static final int $stable = 8;
    public volatile List<PairsContact> contacts;
    public final C20Q<SpacePickerEffect> effects;
    public volatile SpaceCollaborators existing;
    public final ConcurrentHashMap<String, String> inviteRequestIds;
    public volatile String linkRequestId;
    public final PairsInviteMailbox mailbox;
    public final HzR<SpacePickerEffect> mutableEffects;
    public final BLG<SpacePickerUiState> mutableState;
    public final PairsRepository repository;
    public HoC searchJob;
    public volatile HxE<String, ? extends List<PairsSuggestion>> searchResults;
    public final String slug;
    public final C1BN<SpacePickerUiState> state;
    public volatile List<PairsSuggestion> suggestions;

    public final class Factory extends AuraViewModelFactory<SpaceCollaboratorPickerViewModel> {
        public static final int $stable = 8;
        public final String slug;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public SpaceCollaboratorPickerViewModel create() {
            return new SpaceCollaboratorPickerViewModel(PairsRepository.Companion.getInstance(this.userSession), PairsInviteMailbox.Companion.getInstance(this.userSession), this.slug);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.slug = str;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.SpaceCollaboratorPickerViewModel", f = "SpaceCollaboratorPickerViewModel.kt", l = {246, 249, HatchLinkOrderStateMachine.MAX_EMAIL_LENGTH, 252}, m = "addCollaborators", v = 2)
    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorPickerViewModel$addCollaborators$1, reason: invalid class name */
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
            return SpaceCollaboratorPickerViewModel.this.addCollaborators(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.SpaceCollaboratorPickerViewModel", f = "SpaceCollaboratorPickerViewModel.kt", l = {MC.mwa_accounts_center_settings.__CONFIG__}, m = "inboxEnabled", v = 2)
    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorPickerViewModel$inboxEnabled$1, reason: invalid class name and case insensitive filesystem */
    public final class C130171 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C130171(HtJ<? super C130171> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpaceCollaboratorPickerViewModel.this.inboxEnabled(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.SpaceCollaboratorPickerViewModel$invite$2", f = "SpaceCollaboratorPickerViewModel.kt", l = {196, HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT, 211, 215, 226, 241}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorPickerViewModel$invite$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ SpacePickerUiState $current;
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public final /* synthetic */ SpaceCollaboratorPickerViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SpacePickerUiState spacePickerUiState, SpaceCollaboratorPickerViewModel spaceCollaboratorPickerViewModel, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$current = spacePickerUiState;
            this.this$0 = spaceCollaboratorPickerViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$current, this.this$0, htJ);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(13:72|(1:76)|77|133|78|(2:80|96)|134|81|(6:84|(2:86|97)|87|(2:89|91)|68|(0)(10:100|(4:102|(1:106)|107|(1:109))|111|(2:114|112)|152|115|(1:116)|(2:120|(1:122))|124|125))|90|138|68|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:139:0x0174, code lost:
        
            r8.showToast(com.facebook.aura.R.string._name_removed__res_0x7f120fb8, r11.name);
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x0223, code lost:
        
            r1 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0226, code lost:
        
            r1 = e;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:37:0x00bf, B:41:0x00ce], limit reached: 157 */
        /* JADX WARN: Path cross not found for [B:64:0x015b, B:66:0x0161], limit reached: 157 */
        /* JADX WARN: Path cross not found for [B:66:0x0161, B:64:0x015b], limit reached: 157 */
        /* JADX WARN: Removed duplicated region for block: B:100:0x0232  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0299 A[LOOP:4: B:112:0x0293->B:114:0x0299, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:120:0x02df  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007e A[Catch: Exception -> 0x008a, CancellationException -> 0x0311, LOOP:2: B:24:0x0078->B:26:0x007e, LOOP_END, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0311, blocks: (B:14:0x0040, B:15:0x004a, B:17:0x0050, B:18:0x005c, B:23:0x0074, B:24:0x0078, B:26:0x007e, B:78:0x019f, B:81:0x01cf, B:84:0x01df, B:87:0x020a, B:91:0x021c, B:90:0x0211, B:22:0x0071, B:56:0x012c, B:60:0x0151), top: B:128:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x017a  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0209  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0210  */
        /* JADX WARN: Type inference failed for: r2v20, types: [java.util.List] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 806
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.SpaceCollaboratorPickerViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }

        /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorPickerViewModel$invite$2$4, reason: invalid class name */
        public final class AnonymousClass4 extends AbstractC7559F3s implements G0U<HxE<? extends String, ? extends String>, CharSequence> {
            public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

            public AnonymousClass4() {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final CharSequence invoke2(HxE<String, String> hxE) {
                C7384Etj.A0Y(hxE, 0);
                return FGI.A0U(hxE.first, ": ", hxE.second);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ CharSequence invoke(HxE<? extends String, ? extends String> hxE) {
                return invoke2((HxE<String, String>) hxE);
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.SpaceCollaboratorPickerViewModel$inviteWithLink$2", f = "SpaceCollaboratorPickerViewModel.kt", l = {174, 176}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorPickerViewModel$inviteWithLink$2, reason: invalid class name and case insensitive filesystem */
    public final class C130182 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        public C130182(HtJ<? super C130182> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SpaceCollaboratorPickerViewModel.this.new C130182(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SpaceCollaboratorPickerViewModel.this.new C130182(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Throwable {
            BLG<SpacePickerUiState> blg;
            SpacePickerUiState value;
            Object objCreateSpaceInvite = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                if (!(e2 instanceof PairsException) || !((PairsException) e2).isRetryable) {
                    SpaceCollaboratorPickerViewModel.this.linkRequestId = null;
                }
                SpaceCollaboratorPickerViewModel.this.showToast(R.string._name_removed__res_0x7f120fba, new Object[0]);
            }
            if (i == 0) {
                Hwg.A00(objCreateSpaceInvite);
                String strA0u = SpaceCollaboratorPickerViewModel.this.linkRequestId;
                if (strA0u == null) {
                    strA0u = AnonymousClass001.A0u(AnonymousClass002.A0k());
                    SpaceCollaboratorPickerViewModel.this.linkRequestId = strA0u;
                }
                SpaceCollaboratorPickerViewModel spaceCollaboratorPickerViewModel = SpaceCollaboratorPickerViewModel.this;
                PairsRepository pairsRepository = spaceCollaboratorPickerViewModel.repository;
                String str = spaceCollaboratorPickerViewModel.slug;
                this.L$0 = null;
                this.label = 1;
                objCreateSpaceInvite = pairsRepository.createSpaceInvite(str, strA0u, null, this);
                if (objCreateSpaceInvite == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objCreateSpaceInvite);
                    blg = SpaceCollaboratorPickerViewModel.this.mutableState;
                    do {
                        value = blg.getValue();
                    } while (!blg.A6e(value, SpaceCollaboratorPickerViewModelKt.copyState$default(value, null, null, null, null, false, null, false, false, false, 255, null)));
                    return Unit.INSTANCE;
                }
                Hwg.A00(objCreateSpaceInvite);
            }
            SpaceCollaboratorPickerViewModel.this.linkRequestId = null;
            HzR<SpacePickerEffect> hzR = SpaceCollaboratorPickerViewModel.this.mutableEffects;
            SpacePickerEffect.Share share = new SpacePickerEffect.Share(((PairsMintedInvite) objCreateSpaceInvite).url);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (hzR.AcU(share, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            blg = SpaceCollaboratorPickerViewModel.this.mutableState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, SpaceCollaboratorPickerViewModelKt.copyState$default(value, null, null, null, null, false, null, false, false, false, 255, null)));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.SpaceCollaboratorPickerViewModel$load$2", f = "SpaceCollaboratorPickerViewModel.kt", l = {103, 104, 113}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorPickerViewModel$load$2, reason: invalid class name and case insensitive filesystem */
    public final class C130192 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public C130192(HtJ<? super C130192> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SpaceCollaboratorPickerViewModel.this.new C130192(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SpaceCollaboratorPickerViewModel.this.new C130192(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0062 A[Catch: Exception -> 0x0098, CancellationException -> 0x00e5, TryCatch #1 {Exception -> 0x0098, blocks: (B:20:0x004f, B:21:0x0052, B:22:0x005c, B:24:0x0062, B:26:0x006f, B:27:0x0073, B:16:0x0039, B:17:0x003c, B:13:0x0028), top: B:46:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x008e A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 231
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.SpaceCollaboratorPickerViewModel.C130192.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.SpaceCollaboratorPickerViewModel$onQueryChange$2", f = "SpaceCollaboratorPickerViewModel.kt", l = {135, 138}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorPickerViewModel$onQueryChange$2, reason: invalid class name and case insensitive filesystem */
    public final class C130202 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $trimmed;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130202(String str, HtJ<? super C130202> htJ) {
            super(2, htJ);
            this.$trimmed = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SpaceCollaboratorPickerViewModel.this.new C130202(this.$trimmed, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
                obj2 = C0881AGi.A00;
            }
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(300L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    obj2 = (List) obj;
                    SpaceCollaboratorPickerViewModel.this.searchResults = C3cG.A0r(this.$trimmed, obj2);
                    SpaceCollaboratorPickerViewModel.this.rebuild();
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            PairsRepository pairsRepository = SpaceCollaboratorPickerViewModel.this.repository;
            String str = this.$trimmed;
            PairsRecipientPurpose pairsRecipientPurpose = PairsRecipientPurpose.SHARE;
            this.label = 2;
            obj = pairsRepository.searchSuggestions(str, pairsRecipientPurpose, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
            obj2 = (List) obj;
            SpaceCollaboratorPickerViewModel.this.searchResults = C3cG.A0r(this.$trimmed, obj2);
            SpaceCollaboratorPickerViewModel.this.rebuild();
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C130202) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public SpaceCollaboratorPickerViewModel(PairsRepository pairsRepository, PairsInviteMailbox pairsInviteMailbox, String str) {
        AnonymousClass005.A10(pairsRepository, pairsInviteMailbox, str);
        this.repository = pairsRepository;
        this.mailbox = pairsInviteMailbox;
        this.slug = str;
        C9286GCn c9286GCnA14 = C3cG.A14(new SpacePickerUiState(null, null, null, null, false, null, false, false, false, 511, null));
        this.mutableState = c9286GCnA14;
        this.state = C3cG.A11(c9286GCnA14);
        GCV gcvA00 = AbstractC10623Hzj.A00(C79.A00, -2);
        this.mutableEffects = gcvA00;
        this.effects = Hu1.A01(gcvA00);
        this.inviteRequestIds = C60O.A1C();
        C0881AGi c0881AGi = C0881AGi.A00;
        this.contacts = c0881AGi;
        this.suggestions = c0881AGi;
        this.searchResults = C3cG.A0r("", c0881AGi);
        load();
    }

    public final void onQueryChange(String str) {
        SpacePickerUiState value;
        C7384Etj.A0Y(str, 0);
        BLG<SpacePickerUiState> blg = this.mutableState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, SpaceCollaboratorPickerViewModelKt.copyState$default(value, null, str, null, null, false, null, false, false, false, 509, null)));
        rebuild();
        HoC hoC = this.searchJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        String strA0l = AnonymousClass002.A0l(str);
        int length = strA0l.length();
        if (2 > length || length >= 101) {
            return;
        }
        BLL bllA00 = AEu.A00(this);
        this.searchJob = GAo.A02(C79.A00, AnonymousClass001.A0y(), new C130202(strA0l, null), bllA00);
    }

    public final void toggle(SpacePickerPerson spacePickerPerson) {
        ArrayList arrayListA0Q;
        SpacePickerUiState value;
        SpacePickerUiState value2;
        C7384Etj.A0Y(spacePickerPerson, 0);
        SpacePickerUiState value3 = this.mutableState.getValue();
        if (value3.inviting) {
            return;
        }
        if (value3.isSelected(spacePickerPerson)) {
            AHD<SpacePickerPerson> ahd = value3.selected;
            arrayListA0Q = C3cG.A0h();
            for (Object obj : ahd) {
                AnonymousClass006.A1O(((SpacePickerPerson) obj).id, spacePickerPerson.id, obj, arrayListA0Q);
            }
        } else {
            if (atLimit(value3.selected.size())) {
                BLG<SpacePickerUiState> blg = this.mutableState;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, SpaceCollaboratorPickerViewModelKt.copyState$default(value, null, null, null, null, false, null, true, false, false, 447, null)));
                return;
            }
            arrayListA0Q = AbstractC0878AGe.A0Q(spacePickerPerson, value3.selected);
        }
        BLG<SpacePickerUiState> blg2 = this.mutableState;
        do {
            value2 = blg2.getValue();
        } while (!blg2.A6e(value2, SpaceCollaboratorPickerViewModelKt.copyState$default(value2, null, null, null, null, false, AGI.A07(arrayListA0Q), atLimit(arrayListA0Q.size()), false, false, 415, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:40))(0)|7|(1:(1:(1:(1:(4:13|14|15|16)(2:41|42))(4:36|37|(4:39|14|15|16)|20))(6:17|45|26|27|15|16))(1:21))(3:18|(0)|20)|22|43|23|(4:25|27|15|16)|20) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        r3 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        r2 = r10.repository;
        r8 = r10.slug;
        r5.L$0 = r11;
        r5.L$1 = null;
        r5.L$2 = null;
        r5.L$3 = r3;
        r5.L$4 = r2;
        r5.L$5 = r8;
        r5.label = 3;
        r9 = r2.spaceCollaborators(r8, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        if (r9 == r6) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        throw r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object addCollaborators(java.util.List<java.lang.String> r11, X.HtJ<? super kotlin.Unit> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.SpaceCollaboratorPickerViewModel.addCollaborators(java.util.List, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean atLimit(int i) {
        List<SpaceCollaborator> list;
        SpaceCollaborators spaceCollaborators = this.existing;
        return ((spaceCollaborators == null || (list = spaceCollaborators.collaborators) == null) ? 0 : list.size()) + i >= 50;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object inboxEnabled(X.HtJ<? super java.lang.Boolean> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.pairs.SpaceCollaboratorPickerViewModel.C130171
            if (r0 == 0) goto L1e
            r4 = r6
            com.facebook.aura.pairs.SpaceCollaboratorPickerViewModel$inboxEnabled$1 r4 = (com.facebook.aura.pairs.SpaceCollaboratorPickerViewModel.C130171) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L24
            goto L37
        L1e:
            com.facebook.aura.pairs.SpaceCollaboratorPickerViewModel$inboxEnabled$1 r4 = new com.facebook.aura.pairs.SpaceCollaboratorPickerViewModel$inboxEnabled$1
            r4.<init>(r6)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r3)
            com.facebook.aura.pairs.PairsRepository r0 = r5.repository     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L45
            r4.label = r1     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L45
            java.lang.Object r3 = r0.inviteInboxEnabled(r4)     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L45
            if (r3 != r2) goto L3a
            return r2
        L37:
            X.Hwg.A00(r3)     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L45
        L3a:
            boolean r0 = X.AnonymousClass001.A1X(r3)     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L45
            goto L40
        L3f:
            r0 = 0
        L40:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L45:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.SpaceCollaboratorPickerViewModel.inboxEnabled(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rebuild() {
        Set set;
        List list;
        SpacePickerUiState value;
        SpacePickerUiState value2 = this.mutableState.getValue();
        List<String> listSearchTerms = ConnectionsViewModelKt.searchTerms(value2.query);
        SpaceCollaborators spaceCollaborators = this.existing;
        if (spaceCollaborators == null || (set = spaceCollaborators.principals) == null) {
            set = A3q.A00;
        }
        List<PairsContact> list2 = this.contacts;
        ArrayList arrayListA0h = C3cG.A0h();
        for (PairsContact pairsContact : list2) {
            C60Q.A1H(FGI.A0M("muse:", pairsContact.museId), pairsContact, arrayListA0h, set);
        }
        ArrayList<PairsContact> arrayListA0h2 = C3cG.A0h();
        for (Object obj : arrayListA0h) {
            PairsContact pairsContact2 = (PairsContact) obj;
            if (!listSearchTerms.isEmpty() && (!(listSearchTerms instanceof Collection) || !listSearchTerms.isEmpty())) {
                Iterator<String> it = listSearchTerms.iterator();
                while (it.hasNext()) {
                    if (!C7BY.A0q(AnonymousClass001.A0u(pairsContact2.displayName), AnonymousClass005.A0j(it), false)) {
                        break;
                    }
                }
            }
            arrayListA0h2.add(obj);
        }
        ArrayList arrayListA0m = AnonymousClass002.A0m(arrayListA0h2);
        for (PairsContact pairsContact3 : arrayListA0h2) {
            arrayListA0m.add(new SpacePickerPerson(FGI.A0M("muse:", pairsContact3.museId), pairsContact3.displayName, pairsContact3, null));
        }
        String strA0l = AnonymousClass002.A0l(value2.query);
        List<PairsSuggestion> list3 = this.suggestions;
        ArrayList arrayListA0h3 = C3cG.A0h();
        for (PairsSuggestion pairsSuggestion : list3) {
            if (ConnectionsViewModelKt.matches(pairsSuggestion, listSearchTerms)) {
                arrayListA0h3.add(pairsSuggestion);
            }
        }
        HashSet hashSetA13 = C60O.A13();
        Iterator it2 = arrayListA0h3.iterator();
        while (it2.hasNext()) {
            hashSetA13.add(((PairsSuggestion) it2.next()).id);
        }
        HxE<String, ? extends List<PairsSuggestion>> hxE = this.searchResults;
        if (!C7384Etj.areEqual(hxE.first, strA0l) || (list = (List) hxE.second) == null) {
            list = C0881AGi.A00;
        }
        ArrayList arrayListA0h4 = C3cG.A0h();
        for (Object obj2 : list) {
            C60R.A1I(((PairsSuggestion) obj2).id, obj2, hashSetA13, arrayListA0h4);
        }
        ArrayList arrayListA0P = AbstractC0878AGe.A0P(arrayListA0h4, arrayListA0h3);
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(arrayListA0P);
        Iterator it3 = arrayListA0P.iterator();
        while (it3.hasNext()) {
            PairsSuggestion pairsSuggestion2 = (PairsSuggestion) it3.next();
            arrayListA0m2.add(new SpacePickerPerson(pairsSuggestion2.id, pairsSuggestion2.name, null, pairsSuggestion2));
        }
        BLG<SpacePickerUiState> blg = this.mutableState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, SpaceCollaboratorPickerViewModelKt.copyState$default(value, null, null, AGI.A07(arrayListA0m), AGI.A07(arrayListA0m2), false, null, false, false, false, MC.c50_accounts_center_settings.__CONFIG__, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showToast(int i, Object... objArr) {
        ToastApi.INSTANCE.showToast(C4JM.A00().getString(i, Arrays.copyOf(objArr, objArr.length)));
    }

    public final C20Q<SpacePickerEffect> getEffects() {
        return this.effects;
    }

    public final C1BN<SpacePickerUiState> getState() {
        return this.state;
    }

    public final void invite() {
        SpacePickerUiState value;
        SpacePickerUiState value2 = this.mutableState.getValue();
        if (value2.selected.isEmpty() || value2.inviting) {
            return;
        }
        BLG<SpacePickerUiState> blg = this.mutableState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, SpaceCollaboratorPickerViewModelKt.copyState$default(value, null, null, null, null, false, null, false, true, false, 383, null)));
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass2(value2, this, null), AEu.A00(this));
    }

    public final void inviteWithLink() {
        SpacePickerUiState value;
        SpacePickerUiState value2 = this.mutableState.getValue();
        if (value2.mintingLink || value2.inviting) {
            return;
        }
        BLG<SpacePickerUiState> blg = this.mutableState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, SpaceCollaboratorPickerViewModelKt.copyState$default(value, null, null, null, null, false, null, false, false, true, 255, null)));
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C130182(null), AEu.A00(this));
    }

    public final void load() {
        SpacePickerUiState value;
        BLG<SpacePickerUiState> blg = this.mutableState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, SpaceCollaboratorPickerViewModelKt.copyState$default(value, SpacePickerPhase.LOADING, null, null, null, false, null, false, false, false, 510, null)));
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C130192(null), AEu.A00(this));
    }

    private final String newRequestId() {
        return AnonymousClass001.A0u(AnonymousClass002.A0k());
    }
}
