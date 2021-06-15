package sample;
import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.RevisionUtils;
import weka.classifiers.Classifier;
import weka.classifiers.AbstractClassifier;

public class libWeka {

// Generated with Weka 3.8.5
//
// This code is public domain and comes with no warranty.
//
// Timestamp: Thu Jun 10 22:09:58 CDT 2021


    public static class WekaWrapper
            extends AbstractClassifier {

        /**
         * Returns only the toString() method.
         *
         * @return a string describing the classifier
         */
        public String globalInfo() {
            return toString();
        }

        /**
         * Returns the capabilities of this classifier.
         *
         * @return the capabilities
         */
        public Capabilities getCapabilities() {
            weka.core.Capabilities result = new weka.core.Capabilities(this);

            result.enable(weka.core.Capabilities.Capability.NOMINAL_ATTRIBUTES);
            result.enable(weka.core.Capabilities.Capability.NUMERIC_ATTRIBUTES);
            result.enable(weka.core.Capabilities.Capability.DATE_ATTRIBUTES);
            result.enable(weka.core.Capabilities.Capability.MISSING_VALUES);
            result.enable(weka.core.Capabilities.Capability.NOMINAL_CLASS);
            result.enable(weka.core.Capabilities.Capability.MISSING_CLASS_VALUES);


            result.setMinimumNumberInstances(0);

            return result;
        }

        /**
         * only checks the data against its capabilities.
         *
         * @param i the training data
         */
        public void buildClassifier(Instances i) throws Exception {
            // can classifier handle the data?
            getCapabilities().testWithFail(i);
        }

        /**
         * Classifies the given instance.
         *
         * @param i the instance to classify
         * @return the classification result
         */
        public double classifyInstance(Instance i) throws Exception {
            Object[] s = new Object[i.numAttributes()];

            for (int j = 0; j < s.length; j++) {
                if (!i.isMissing(j)) {
                    if (i.attribute(j).isNominal())
                        s[j] = new String(i.stringValue(j));
                    else if (i.attribute(j).isNumeric())
                        s[j] = new Double(i.value(j));
                }
            }

            // set class value to missing
            s[i.classIndex()] = null;

            return WekaClassifier.classify(s);
        }

        /**
         * Returns the revision string.
         *
         * @return        the revision
         */
        public String getRevision() {
            return RevisionUtils.extract("1.0");
        }

        /**
         * Returns only the classnames and what classifier it is based on.
         *
         * @return a short description
         */
        public String toString() {
            return "Auto-generated classifier wrapper, based on weka.classifiers.trees.J48 (generated with Weka 3.8.5).\n" + this.getClass().getName() + "/WekaClassifier";
        }

        /**
         * Runs the classfier from commandline.
         *
         * @param args the commandline arguments
         */
        public static void main(String args[]) {
            runClassifier(new WekaWrapper(), args);
        }
    }

    static class WekaClassifier {

        public static double classify(Object[] i)
                throws Exception {

            double p = Double.NaN;
            p = WekaClassifier.N40a4a4f90(i);
            return p;
        }
        static double N40a4a4f90(Object []i) {
            double p = Double.NaN;
            if (i[0] == null) {
                p = 1;
            } else if (((Double) i[0]).doubleValue() <= 4.0) {
                p = WekaClassifier.N3fd10b131(i);
            } else if (((Double) i[0]).doubleValue() > 4.0) {
                p = 0;
            }
            return p;
        }
        static double N3fd10b131(Object []i) {
            double p = Double.NaN;
            if (i[2] == null) {
                p = 1;
            } else if (((Double) i[2]).doubleValue() <= 3.0) {
                p = 1;
            } else if (((Double) i[2]).doubleValue() > 3.0) {
                p = WekaClassifier.N56d911ae2(i);
            }
            return p;
        }
        static double N56d911ae2(Object []i) {
            double p = Double.NaN;
            if (i[1] == null) {
                p = 1;
            } else if (((Double) i[1]).doubleValue() <= 69.0) {
                p = WekaClassifier.N5deab92d3(i);
            } else if (((Double) i[1]).doubleValue() > 69.0) {
                p = 0;
            }
            return p;
        }
        static double N5deab92d3(Object []i) {
            double p = Double.NaN;
            if (i[3] == null) {
                p = 1;
            } else if (((Double) i[3]).doubleValue() <= 3.0) {
                p = 1;
            } else if (((Double) i[3]).doubleValue() > 3.0) {
                p = WekaClassifier.N380c5d054(i);
            }
            return p;
        }
        static double N380c5d054(Object []i) {
            double p = Double.NaN;
            if (i[3] == null) {
                p = 1;
            } else if (((Double) i[3]).doubleValue() <= 4.0) {
                p = WekaClassifier.Nfb240845(i);
            } else if (((Double) i[3]).doubleValue() > 4.0) {
                p = 0;
            }
            return p;
        }
        static double Nfb240845(Object []i) {
            double p = Double.NaN;
            if (i[0] == null) {
                p = 1;
            } else if (((Double) i[0]).doubleValue() <= 3.0) {
                p = 1;
            } else if (((Double) i[0]).doubleValue() > 3.0) {
                p = 0;
            }
            return p;
        }
    }

}
