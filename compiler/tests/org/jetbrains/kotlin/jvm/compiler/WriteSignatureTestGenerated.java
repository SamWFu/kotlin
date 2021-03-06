/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.jvm.compiler;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/writeSignature")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class WriteSignatureTestGenerated extends AbstractWriteSignatureTest {
    public void testAllFilesPresentInWriteSignature() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/writeSignature"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("ArrayOfCharSequence.kt")
    public void testArrayOfCharSequence() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/ArrayOfCharSequence.kt");
        doTest(fileName);
    }

    @TestMetadata("ArrayOfInt.kt")
    public void testArrayOfInt() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/ArrayOfInt.kt");
        doTest(fileName);
    }

    @TestMetadata("backingFieldForGenericDelegated.kt")
    public void testBackingFieldForGenericDelegated() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/backingFieldForGenericDelegated.kt");
        doTest(fileName);
    }

    @TestMetadata("Comparable.kt")
    public void testComparable() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/Comparable.kt");
        doTest(fileName);
    }

    @TestMetadata("DeepGenericInnerClass.kt")
    public void testDeepGenericInnerClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/DeepGenericInnerClass.kt");
        doTest(fileName);
    }

    @TestMetadata("GenericInnerClass.kt")
    public void testGenericInnerClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/GenericInnerClass.kt");
        doTest(fileName);
    }

    @TestMetadata("GenericInnerClassWithSimpleOuter.kt")
    public void testGenericInnerClassWithSimpleOuter() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/GenericInnerClassWithSimpleOuter.kt");
        doTest(fileName);
    }

    @TestMetadata("Int.kt")
    public void testInt() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/Int.kt");
        doTest(fileName);
    }

    @TestMetadata("IntArray.kt")
    public void testIntArray() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/IntArray.kt");
        doTest(fileName);
    }

    @TestMetadata("IntQ.kt")
    public void testIntQ() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/IntQ.kt");
        doTest(fileName);
    }

    @TestMetadata("jlString.kt")
    public void testJlString() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/jlString.kt");
        doTest(fileName);
    }

    @TestMetadata("ListOfCharSequence.kt")
    public void testListOfCharSequence() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/ListOfCharSequence.kt");
        doTest(fileName);
    }

    @TestMetadata("ListOfStar.kt")
    public void testListOfStar() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/ListOfStar.kt");
        doTest(fileName);
    }

    @TestMetadata("MapEntry.kt")
    public void testMapEntry() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/MapEntry.kt");
        doTest(fileName);
    }

    @TestMetadata("MutableMapEntry.kt")
    public void testMutableMapEntry() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/MutableMapEntry.kt");
        doTest(fileName);
    }

    @TestMetadata("NonGeneric.kt")
    public void testNonGeneric() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/NonGeneric.kt");
        doTest(fileName);
    }

    @TestMetadata("StarProjectionInClass.kt")
    public void testStarProjectionInClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/StarProjectionInClass.kt");
        doTest(fileName);
    }

    @TestMetadata("StarProjectionInSuper.kt")
    public void testStarProjectionInSuper() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/StarProjectionInSuper.kt");
        doTest(fileName);
    }

    @TestMetadata("StarProjectionOutsideClass.kt")
    public void testStarProjectionOutsideClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/StarProjectionOutsideClass.kt");
        doTest(fileName);
    }

    @TestMetadata("syntheticAccessorForGeneric.kt")
    public void testSyntheticAccessorForGeneric() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/syntheticAccessorForGeneric.kt");
        doTest(fileName);
    }

    @TestMetadata("VarargCharSequence.kt")
    public void testVarargCharSequence() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/VarargCharSequence.kt");
        doTest(fileName);
    }

    @TestMetadata("VarargGeneric.kt")
    public void testVarargGeneric() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/VarargGeneric.kt");
        doTest(fileName);
    }

    @TestMetadata("compiler/testData/writeSignature/annotations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Annotations extends AbstractWriteSignatureTest {
        public void testAllFilesPresentInAnnotations() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/writeSignature/annotations"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("kArrayClassOfJClass.kt")
        public void testKArrayClassOfJClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/annotations/kArrayClassOfJClass.kt");
            doTest(fileName);
        }

        @TestMetadata("kArrayClassOfKClass.kt")
        public void testKArrayClassOfKClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/annotations/kArrayClassOfKClass.kt");
            doTest(fileName);
        }

        @TestMetadata("kClassBasic.kt")
        public void testKClassBasic() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/annotations/kClassBasic.kt");
            doTest(fileName);
        }

        @TestMetadata("kClassInt.kt")
        public void testKClassInt() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/annotations/kClassInt.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/writeSignature/callableReference")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class CallableReference extends AbstractWriteSignatureTest {
        public void testAllFilesPresentInCallableReference() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/writeSignature/callableReference"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("constructorReferenceInReturnType.kt")
        public void testConstructorReferenceInReturnType() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/callableReference/constructorReferenceInReturnType.kt");
            doTest(fileName);
        }

        @TestMetadata("functionReferenceInvoke.kt")
        public void testFunctionReferenceInvoke() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/callableReference/functionReferenceInvoke.kt");
            doTest(fileName);
        }

        @TestMetadata("propertyReferenceGet.kt")
        public void testPropertyReferenceGet() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/callableReference/propertyReferenceGet.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/writeSignature/constructor")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Constructor extends AbstractWriteSignatureTest {
        public void testAllFilesPresentInConstructor() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/writeSignature/constructor"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("Constructor0.kt")
        public void testConstructor0() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/constructor/Constructor0.kt");
            doTest(fileName);
        }

        @TestMetadata("ConstructorCollectionParameter.kt")
        public void testConstructorCollectionParameter() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/constructor/ConstructorCollectionParameter.kt");
            doTest(fileName);
        }

        @TestMetadata("ConstructorWithTypeParameter.kt")
        public void testConstructorWithTypeParameter() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/constructor/ConstructorWithTypeParameter.kt");
            doTest(fileName);
        }

        @TestMetadata("ConstructorWithTypeParameterAndValueParameterP.kt")
        public void testConstructorWithTypeParameterAndValueParameterP() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/constructor/ConstructorWithTypeParameterAndValueParameterP.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/writeSignature/declarationSiteVariance")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class DeclarationSiteVariance extends AbstractWriteSignatureTest {
        public void testAllFilesPresentInDeclarationSiteVariance() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/writeSignature/declarationSiteVariance"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("FunctionTwoTypeParameters.kt")
        public void testFunctionTwoTypeParameters() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/FunctionTwoTypeParameters.kt");
            doTest(fileName);
        }

        @TestMetadata("GenericOverrides.kt")
        public void testGenericOverrides() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/GenericOverrides.kt");
            doTest(fileName);
        }

        @TestMetadata("InInInPosition.kt")
        public void testInInInPosition() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/InInInPosition.kt");
            doTest(fileName);
        }

        @TestMetadata("InInOutPosition.kt")
        public void testInInOutPosition() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/InInOutPosition.kt");
            doTest(fileName);
        }

        @TestMetadata("InOfInInInPosition.kt")
        public void testInOfInInInPosition() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/InOfInInInPosition.kt");
            doTest(fileName);
        }

        @TestMetadata("InOfInInOutPosition.kt")
        public void testInOfInInOutPosition() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/InOfInInOutPosition.kt");
            doTest(fileName);
        }

        @TestMetadata("InOfOutInInPosition.kt")
        public void testInOfOutInInPosition() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/InOfOutInInPosition.kt");
            doTest(fileName);
        }

        @TestMetadata("InOfOutInOutPosition.kt")
        public void testInOfOutInOutPosition() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/InOfOutInOutPosition.kt");
            doTest(fileName);
        }

        @TestMetadata("MappedSupertypeWithVariance.kt")
        public void testMappedSupertypeWithVariance() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/MappedSupertypeWithVariance.kt");
            doTest(fileName);
        }

        @TestMetadata("OpenMembersReturnType.kt")
        public void testOpenMembersReturnType() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/OpenMembersReturnType.kt");
            doTest(fileName);
        }

        @TestMetadata("OpenMembersValueParameter.kt")
        public void testOpenMembersValueParameter() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/OpenMembersValueParameter.kt");
            doTest(fileName);
        }

        @TestMetadata("OutInField.kt")
        public void testOutInField() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/OutInField.kt");
            doTest(fileName);
        }

        @TestMetadata("OutInInPosition.kt")
        public void testOutInInPosition() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/OutInInPosition.kt");
            doTest(fileName);
        }

        @TestMetadata("OutInOutPosition.kt")
        public void testOutInOutPosition() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/OutInOutPosition.kt");
            doTest(fileName);
        }

        @TestMetadata("OutOfInInInPosition.kt")
        public void testOutOfInInInPosition() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/OutOfInInInPosition.kt");
            doTest(fileName);
        }

        @TestMetadata("OutOfInInOutPosition.kt")
        public void testOutOfInInOutPosition() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/OutOfInInOutPosition.kt");
            doTest(fileName);
        }

        @TestMetadata("OutOfOutInInPosition.kt")
        public void testOutOfOutInInPosition() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/OutOfOutInInPosition.kt");
            doTest(fileName);
        }

        @TestMetadata("OutOfOutInOutPosition.kt")
        public void testOutOfOutInOutPosition() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/OutOfOutInOutPosition.kt");
            doTest(fileName);
        }

        @TestMetadata("PropertyGetterIn.kt")
        public void testPropertyGetterIn() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/PropertyGetterIn.kt");
            doTest(fileName);
        }

        @TestMetadata("PropertyGetterOut.kt")
        public void testPropertyGetterOut() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/PropertyGetterOut.kt");
            doTest(fileName);
        }

        @TestMetadata("PropertyGetterTwoParams.kt")
        public void testPropertyGetterTwoParams() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/PropertyGetterTwoParams.kt");
            doTest(fileName);
        }

        @TestMetadata("PropertySetterIn.kt")
        public void testPropertySetterIn() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/PropertySetterIn.kt");
            doTest(fileName);
        }

        @TestMetadata("PropertySetterOut.kt")
        public void testPropertySetterOut() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/PropertySetterOut.kt");
            doTest(fileName);
        }

        @TestMetadata("RedundantProjections.kt")
        public void testRedundantProjections() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/RedundantProjections.kt");
            doTest(fileName);
        }

        @TestMetadata("SuperClassWithVariance.kt")
        public void testSuperClassWithVariance() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/SuperClassWithVariance.kt");
            doTest(fileName);
        }

        @TestMetadata("SuperTraitWithVariance.kt")
        public void testSuperTraitWithVariance() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/SuperTraitWithVariance.kt");
            doTest(fileName);
        }

        @TestMetadata("SuperTypeWithVarianceInArguments.kt")
        public void testSuperTypeWithVarianceInArguments() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/SuperTypeWithVarianceInArguments.kt");
            doTest(fileName);
        }

        @TestMetadata("compiler/testData/writeSignature/declarationSiteVariance/jvmWildcardAnnotations")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class JvmWildcardAnnotations extends AbstractWriteSignatureTest {
            public void testAllFilesPresentInJvmWildcardAnnotations() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/writeSignature/declarationSiteVariance/jvmWildcardAnnotations"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("onFunction.kt")
            public void testOnFunction() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/jvmWildcardAnnotations/onFunction.kt");
                doTest(fileName);
            }

            @TestMetadata("onTypes.kt")
            public void testOnTypes() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/jvmWildcardAnnotations/onTypes.kt");
                doTest(fileName);
            }

            @TestMetadata("primitiveTypes.kt")
            public void testPrimitiveTypes() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/jvmWildcardAnnotations/primitiveTypes.kt");
                doTest(fileName);
            }
        }

        @TestMetadata("compiler/testData/writeSignature/declarationSiteVariance/wildcardOptimization")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class WildcardOptimization extends AbstractWriteSignatureTest {
            public void testAllFilesPresentInWildcardOptimization() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/writeSignature/declarationSiteVariance/wildcardOptimization"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("argumentOverridability.kt")
            public void testArgumentOverridability() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/wildcardOptimization/argumentOverridability.kt");
                doTest(fileName);
            }

            @TestMetadata("arrays.kt")
            public void testArrays() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/wildcardOptimization/arrays.kt");
                doTest(fileName);
            }

            @TestMetadata("complicatedInBounds.kt")
            public void testComplicatedInBounds() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/wildcardOptimization/complicatedInBounds.kt");
                doTest(fileName);
            }

            @TestMetadata("deepOut.kt")
            public void testDeepOut() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/wildcardOptimization/deepOut.kt");
                doTest(fileName);
            }

            @TestMetadata("fields.kt")
            public void testFields() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/wildcardOptimization/fields.kt");
                doTest(fileName);
            }

            @TestMetadata("finalReturnType.kt")
            public void testFinalReturnType() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/wildcardOptimization/finalReturnType.kt");
                doTest(fileName);
            }

            @TestMetadata("outIn.kt")
            public void testOutIn() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/wildcardOptimization/outIn.kt");
                doTest(fileName);
            }

            @TestMetadata("outInv.kt")
            public void testOutInv() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/wildcardOptimization/outInv.kt");
                doTest(fileName);
            }

            @TestMetadata("topLevelIn.kt")
            public void testTopLevelIn() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/wildcardOptimization/topLevelIn.kt");
                doTest(fileName);
            }

            @TestMetadata("topLevelInv.kt")
            public void testTopLevelInv() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/wildcardOptimization/topLevelInv.kt");
                doTest(fileName);
            }

            @TestMetadata("typeParameter.kt")
            public void testTypeParameter() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/declarationSiteVariance/wildcardOptimization/typeParameter.kt");
                doTest(fileName);
            }
        }
    }

    @TestMetadata("compiler/testData/writeSignature/defaultImpls")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class DefaultImpls extends AbstractWriteSignatureTest {
        public void testAllFilesPresentInDefaultImpls() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/writeSignature/defaultImpls"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("functionTypeParameterClash.kt")
        public void testFunctionTypeParameterClash() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/defaultImpls/functionTypeParameterClash.kt");
            doTest(fileName);
        }

        @TestMetadata("functionTypeParameterClashWith_I.kt")
        public void testFunctionTypeParameterClashWith_I() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/defaultImpls/functionTypeParameterClashWith_I.kt");
            doTest(fileName);
        }

        @TestMetadata("propertyTypeParameterClash.kt")
        public void testPropertyTypeParameterClash() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/defaultImpls/propertyTypeParameterClash.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/writeSignature/nothing")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Nothing extends AbstractWriteSignatureTest {
        public void testAllFilesPresentInNothing() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/writeSignature/nothing"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("nothing.kt")
        public void testNothing() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/nothing/nothing.kt");
            doTest(fileName);
        }

        @TestMetadata("nullableNothing.kt")
        public void testNullableNothing() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/writeSignature/nothing/nullableNothing.kt");
            doTest(fileName);
        }
    }
}
