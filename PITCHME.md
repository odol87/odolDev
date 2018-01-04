#HSLIDE
## webpack
### 웹개발 주니어가 본 webpack
*중간 중간 많은 지적 부탁드립니다*
~~겉핥기 & 짧음 주의~~
![webpack image](https://webpack.github.io/assets/what-is-webpack.png)


#HSLIDE
## Why use module bundler
1. without module?
2. HTTP 1.1
3. script src="blahblah"
4. IE..

#HSLIDE
## Concepts
    - Entry
    - Output
    - Loaders
    - Plugins

#HSLIDE
## better than others
 - loader
 - faster than browserify
 - module + bundler = webpack
 - plugins

#HSLIDE
## plugins
 - new UglifyJsPlugin()
 - new ExtractTextPlugin()
 - new I18nWebpackPlugin()
 - new NpmInstallWebpackPlugin()
 - [공식](https://webpack.js.org/plugins/)
 - [third-party](https://github.com/webpack-contrib/awesome-webpack#webpack-plugins)

#HSLIDE
## webpack 3 what's new
[webpack3-official-release](https://medium.com/webpack/webpack-3-official-release-15fd2dd8f07b)
- Scope hoisting
- Magic comments
- Bundle size 1.3% decrease
- JS performance faster
- automatic -loader removed
- preloaders -> enfoerce: "pre"
- [ETC](https://webpack.js.org/guides/migrating/)


#HSLIDE
## 보충해 주실분?

#VSLIDE
## VS Parcel-bundler
- webpack을 기존의 것들?로 만들 기세
- ~~no config~~
- 매우 빠름 [Benchmarks](https://www.npmjs.com/package/parcel-bundler#benchmarks)
- 한 글 문 서
- babel, react, postcss등 어느정도는 대응 중 (설정파일을 읽어서) [transforms](https://parceljs.org/transforms.html)

#HSLIDE
## Parcel-bundler 맛보기
```
npm i -g parcel-bundler
npm init -y
paercel index.html
```
-p port_number

[HMR](https://parceljs.org/hmr.html)

### Parcel build
```
parcel build index.js --out-dir ./
```
### compare
- plugins?
- migration?

#HSLIDE
## Parcel 느낀점
 - 토이 프로젝트때 빠르게 찍어내기 좋겠군

#VSLIDE
## 끝
[webpack 한글 레퍼런스 끝판왕](https://hyunseob.github.io/2017/03/21/webpack2-beginners-guide/)



