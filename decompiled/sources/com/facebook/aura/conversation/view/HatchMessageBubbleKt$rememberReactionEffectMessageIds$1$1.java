package com.facebook.aura.conversation.view;

import X.A3q;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BGK;
import X.BO7;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.repo.HatchReactionLanding;
import com.facebook.aura.utils.HatchUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchMessageBubbleKt$rememberReactionEffectMessageIds$1$1", f = "HatchMessageBubble.kt", l = {442}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchMessageBubbleKt$rememberReactionEffectMessageIds$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Set<String>> $active;
    public final /* synthetic */ C22I<HatchReactionLanding> $landed;
    public Object L$0;
    public Object L$1;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchMessageBubbleKt$rememberReactionEffectMessageIds$1$1$1", f = "HatchMessageBubble.kt", l = {443}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchMessageBubbleKt$rememberReactionEffectMessageIds$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<?>, Object> {
        public final /* synthetic */ MutableState<Set<String>> $active;
        public final /* synthetic */ C22I<HatchReactionLanding> $landed;
        public final /* synthetic */ Map<String, Long> $newest;
        public final /* synthetic */ BO7 $sequence;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C22I<HatchReactionLanding> c22i, BO7 bo7, Map<String, Long> map, MutableState<Set<String>> mutableState, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$landed = c22i;
            this.$sequence = bo7;
            this.$newest = map;
            this.$active = mutableState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$landed, this.$sequence, this.$newest, this.$active, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            final C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<HatchReactionLanding> c22i = this.$landed;
                final BO7 bo7 = this.$sequence;
                final Map<String, Long> map = this.$newest;
                final MutableState<Set<String>> mutableState = this.$active;
                C20Z<? super HatchReactionLanding> c20z = new C20Z() { // from class: com.facebook.aura.conversation.view.HatchMessageBubbleKt.rememberReactionEffectMessageIds.1.1.1.1

                    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchMessageBubbleKt$rememberReactionEffectMessageIds$1$1$1$1$1", f = "HatchMessageBubble.kt", l = {453}, m = "invokeSuspend", v = 2)
                    /* renamed from: com.facebook.aura.conversation.view.HatchMessageBubbleKt$rememberReactionEffectMessageIds$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                    public final class C01091 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
                        public final /* synthetic */ MutableState<Set<String>> $active;
                        public final /* synthetic */ String $id;
                        public final /* synthetic */ long $mine;
                        public final /* synthetic */ Map<String, Long> $newest;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C01091(Map<String, Long> map, String str, long j, MutableState<Set<String>> mutableState, HtJ<? super C01091> htJ) {
                            super(2, htJ);
                            this.$newest = map;
                            this.$id = str;
                            this.$mine = j;
                            this.$active = mutableState;
                        }

                        @Override // X.AbstractC8884Fsp
                        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                            return new C01091(this.$newest, this.$id, this.$mine, this.$active, htJ);
                        }

                        @Override // X.AbstractC8884Fsp
                        public final Object invokeSuspend(Object obj) {
                            Long l;
                            long j;
                            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                            int i = this.label;
                            try {
                                if (i == 0) {
                                    Hwg.A00(obj);
                                    this.label = 1;
                                    if (C7Bq.A01(2000L, this) == enumC10460Hji) {
                                        return enumC10460Hji;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw AnonymousClass001.A0n();
                                    }
                                    Hwg.A00(obj);
                                }
                                if (l != null && l.longValue() == j) {
                                    this.$newest.remove(this.$id);
                                    MutableState<Set<String>> mutableState = this.$active;
                                    mutableState.Af8(BGK.A04(this.$id, mutableState.getValue()));
                                }
                                return Unit.INSTANCE;
                            } finally {
                                l = this.$newest.get(this.$id);
                                j = this.$mine;
                                if (l != null && l.longValue() == j) {
                                    this.$newest.remove(this.$id);
                                    MutableState<Set<String>> mutableState2 = this.$active;
                                    mutableState2.Af8(BGK.A04(this.$id, mutableState2.getValue()));
                                }
                            }
                        }

                        @Override // X.G0V
                        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                            return ((C01091) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HatchReactionLanding) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(HatchReactionLanding hatchReactionLanding, HtJ<? super Unit> htJ) {
                        if (HatchUtil.INSTANCE.isChatReactionAnimationEnabled()) {
                            String str = hatchReactionLanding.messageId;
                            BO7 bo72 = bo7;
                            long j = bo72.element + 1;
                            bo72.element = j;
                            map.put(str, new Long(j));
                            MutableState<Set<String>> mutableState2 = mutableState;
                            mutableState2.Af8(BGK.A02(str, mutableState2.getValue()));
                            AnonymousClass001.A1J(new C01091(map, str, j, mutableState, null), c3ux);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.label = 1;
                if (c22i.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<?> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageBubbleKt$rememberReactionEffectMessageIds$1$1(MutableState<Set<String>> mutableState, C22I<HatchReactionLanding> c22i, HtJ<? super HatchMessageBubbleKt$rememberReactionEffectMessageIds$1$1> htJ) {
        super(2, htJ);
        this.$active = mutableState;
        this.$landed = c22i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchMessageBubbleKt$rememberReactionEffectMessageIds$1$1(this.$active, this.$landed, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$landed, new BO7(), linkedHashMap, this.$active, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (Hxb.A00(anonymousClass1, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            this.$active.Af8(A3q.A00);
            throw th;
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchMessageBubbleKt$rememberReactionEffectMessageIds$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
