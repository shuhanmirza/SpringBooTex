# SpringBooTex

SpringBooTex is PDF Generator REST Service which can be deplpyed out of the box. It can generate PDFs from LaTex and HTML Templates. It supports variable and file embeddings. 

Under the hood, it uses [pdfTeX / pdfLaTeX](https://tug.org/applications/pdftex) to create a PDF from a .tex file. For generating PDFs from HTML templates it uses [openhtmltopdf](https://github.com/danfickle/openhtmltopdf) and Thymeleaf.

## Getting Started
You can download the source code for SpringBooTex by running `git clone github.com/shuhanmirza/SpringBooTex` in your terminal.
After that you can run `docker-compose up --build`.

SpringBooTex will run as an REST service by default on port 10800; 

### Generating PDFs
PDF's are generated by sending an HTTP POST request to the endpoint "/api/generate-pdf" with a JSON payload:
```
{
    "templateType": "LATEX | HTML",
    "templateSourceType": "BASE64",
    "templateSource": "TEMPLATE_SOURCE",
    "stringMap": { KEY_VALUE_MAP },
    "listMap" : { KEY_LIST_MAP },
    "fileUrlMap": { KEY_FILE_MAP },
    "responseType": "JSON | OCTET_STREAM | PDF"
}
```

#### Example: Generating a PDF from latex template

https://github.com/shuhanmirza/SpringBooTex/blob/9527c95cc7a7d11a53784f0b2071b6f9c7fcc679/Doc/example.tex


## Contributing
Please!

## Inspiration
- [LaTTe](https://github.com/raphaelreyna/latte)