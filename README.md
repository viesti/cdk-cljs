# cljs-cdk example

Sample code on using the AWS CDK libraries via shadow-cljs


```
0% shadow-cljs compile :app
[:app] Compiling ...
[:app] Build completed. (46 files, 0 compiled, 0 warnings, 1.86s)
0% node out/main.js
{
  "Resources": {
    "mybucket15D133BF": {
      "Type": "AWS::S3::Bucket",
      "UpdateReplacePolicy": "Retain",
      "DeletionPolicy": "Retain"
    }
  }
}
```
